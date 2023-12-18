import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int n = sc.nextInt();
		long minus[] = new long[n];
		HashMap<Long, Integer> plus = new HashMap<Long, Integer>();

		for (int i = 0; i < n; i++) {
			long a = sc.nextInt();
			minus[i] = i - a;
			if (Objects.nonNull(plus.get(i + a))) {
				plus.put(i + a, plus.get(i + a) + 1);
			} else {
				plus.put(i + a, 1);
			}
		}

		long pair = 0;
		for (int i = 0; i < n; i++) {
			if (Objects.nonNull(plus.get(minus[i]))) {
				pair += plus.get(minus[i]);
			}
		}

		// 出力
		System.out.println(pair);
		sc.close();
	}
}
