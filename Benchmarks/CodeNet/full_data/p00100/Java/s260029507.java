import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();
			for (int i = 0; i < n; i++) {
				String[] str = br.readLine().split(" ");
				int num = Integer.parseInt(str[0]);
				int price = Integer.parseInt(str[1]);
				int cnt = Integer.parseInt(str[2]);
				if (data.containsKey(num))
					data.put(num, data.get(num) + (price * cnt));
				else
					data.put(num, price * cnt);
			}
				boolean naFlg = true;
				for (int d : data.keySet()) {
					if (data.get(d) >= 1000000) {
						naFlg = false;
						System.out.println(d);
					}
				}
				if (naFlg) System.out.println("NA");
		}

	}

}