import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		String[] datas = br.readLine().split(" ");
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			int data = Integer.parseInt(datas[i]);
			if (list.size() == k) {
				int temp = list.getFirst();
				if (Math.abs(temp) >= Math.abs(data)) {
					list.poll();
					list.add(data);
				} else {
					break;
				}
			} else {
				list.add(data);
			}
		}
		int l = list.getFirst();
		int r = list.getLast();
		int rs = 0;
		if (r <= 0) {
			rs = Math.abs(l);
		} else if (l >= 0) {
			rs = r;
		} else {
			rs = Math.abs(l) > r ? r * 2 + Math.abs(l) : Math.abs(l) * 2 + r;
		}
		System.out.println(rs);
	}

}