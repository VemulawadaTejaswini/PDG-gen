import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();
		int cnt = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			cnt = 0;
			for (int j = 0; j < N; j++) {
				if (i == j)
					continue;
				// 指定箇所より右（E）
				if (i < j) {
					if (String.valueOf(S.charAt(j)).equals("E")) {
						cnt++;
					}
					// 指定箇所より左
				} else {
					if (String.valueOf(S.charAt(j)).equals("W")) {
						cnt++;
					}
				}
			}
			min = Math.min(min, cnt);
		}
		System.out.println(min);
	}

}