import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// https://atcoder.jp/contests/abc159/tasks/abc159_d
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		HashMap<String, Integer> map = new HashMap<>();
		String[] arrayA = new String[N];
		for (int i = 0; i < N; i++) {
			arrayA[i] = sc.next();
			String str = arrayA[i];
			if (map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			} else {
				map.put(str, 1);
			}
		}
		sc.close();

		for(int k=0;k<N;k++) {
			int ans = 0;
			String number = arrayA[k];
			map.put(number, map.get(number)-1);
			for (Map.Entry<String, Integer> bar : map.entrySet()) {
//				System.out.println(bar.getKey()+"："+bar.getValue());
				if(bar.getValue()>=2) {
					ans = ans + bar.getValue()*(bar.getValue()-1)/2;
				}
			}
			System.out.println(ans);
			map.put(number, map.get(number)+1);
		}

	}
}
