import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int n = sc.nextInt();
		int minus[] = new int[n];
		HashMap<Integer, Integer> plus = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (Objects.isNull(plus.get(i + a))) {
				plus.put(i + a, 1);
			} else {
				plus.put(i + a, plus.get(i + a)+ 1);
			}
			minus[i] = i - a;
		}

		int pair = 0;
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
