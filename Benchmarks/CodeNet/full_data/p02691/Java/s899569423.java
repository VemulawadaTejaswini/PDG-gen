import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int n = sc.nextInt();
		int a[] = new int[n];

		int pair = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			for (int j = 0; i - j > a[i]; j++) {
				if (i - j == a[i] + a[j]) {
					pair++;
				}
			}
		}

		// 出力
		System.out.println(pair);
		sc.close();
	}
}
