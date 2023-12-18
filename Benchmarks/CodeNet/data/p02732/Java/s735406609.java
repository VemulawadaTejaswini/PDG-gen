	import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

	// https://atcoder.jp/contests/abc159/tasks/abc159_d
	public class Main {

		public static void main(String[] args) {
			// TODO 自動生成されたメソッド・スタブ

			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();

			HashMap<String, Long> map = new HashMap<>();
			String[] arrayA = new String[N];
			for (int i = 0; i < N; i++) {
				arrayA[i] = sc.next();
				String str = arrayA[i];
				if (map.containsKey(str)) {
					map.put(str, map.get(str)+1);
				} else {
					map.put(str,1L);
				}
			}
			sc.close();

			long ans1 = 0;
			for (Map.Entry<String, Long> bar : map.entrySet()) {
				Long a = bar.getValue();
				ans1 = ans1 + a*(a-1)/2;
			}

			for(int k=0;k<N;k++) {
				long ans = ans1;
				String number = arrayA[k];
				Long a = map.get(number);
				if(a!=0) {
					ans = ans - a*(a-1)/2 + (a-1)*(a-2)/2;
				}
				System.out.println(ans);
			}
		}
	}
