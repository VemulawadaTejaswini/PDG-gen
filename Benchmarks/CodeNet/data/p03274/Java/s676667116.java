
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int k = Integer.parseInt(str[1]);
		String[] datas = br.readLine().split(" ");

		int[] arr = new int[datas.length];
		for (int i = 0; i < datas.length; i++) {
			arr[i] = Integer.parseInt(datas[i]);
		}
		if (arr[0] >= 0) {
			System.out.println(arr[k - 1]);
			return;
		}
		if (arr[arr.length - 1] <= 0) {
			System.out.println(arr[arr.length - k] * -1);
			return;
		}
		if(arr.length == k) {
			int l = arr[0];
			int r = arr[arr.length-1];
			int rs = Math.abs(l) > r ? r * 2 + Math.abs(l) : Math.abs(l) * 2 + r;
			System.out.println(rs);
			return;
		}
		int l = 0;
		int r = k - 1;
		int out = 0;
		while (k < arr.length) {
			if (r < arr.length - 1) {
				int lv = arr[l];
				int lv1 = arr[l + 1];
				int rv = arr[r];
				int rv1 = arr[r + 1];
				int rs = Math.abs(lv) > rv ? rv * 2 + Math.abs(lv) : Math.abs(lv) * 2 + rv;
				int rs1 = Math.abs(lv1) > rv1 ? rv1 * 2 + Math.abs(lv1) : Math.abs(lv1) * 2 + rv1;
				if (rs >= rs1) {
					l++;
					r++;
					out = rs1;
				} else {
					out = rs;
					break;
				}
			} else {
				break;
			}
		}
		System.out.println(out);
	}

}