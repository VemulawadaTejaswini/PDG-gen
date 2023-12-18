import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		sc.close();

		int cnt = 0;
		for (int i = 0; i < n; i++) {
			char cA = a.charAt(i);
			char cB = b.charAt(i);
			char cC = c.charAt(i);
			if (cA == cB && cB == cC) {
				// 全て一致
			} else if (cA == cB || cB == cC || cC == cA) {
				// ２つ一致
				cnt++;
			} else {
				// ばらばら
				cnt += 2;
			}
		}
		System.out.println(cnt);
	}
}
