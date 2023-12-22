import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int n = sc.nextInt();
		Integer plus[] = new Integer[n];

		int pair = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			pair += Collections.frequency(Arrays.asList(plus), i - a);
			plus[i] = i + a;
		}

		// 出力
		System.out.println(pair);
		sc.close();
	}
}
