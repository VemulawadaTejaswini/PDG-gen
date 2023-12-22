import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b, c1, c2, q1, q2;
		int ans1, ans2;
		
		while (true) {
			q1 = sc.nextInt();
			if (q1 == 0) {
				break;
			}
			b = sc.nextInt();
			c1 = sc.nextInt();
			c2 = sc.nextInt();
			q2 = sc.nextInt();
			ans1 = -1;
			ans2 = -1;
			
			for (int i = q2; 0 < i; i--) {
				int cost1 = c1 * i;
				int money = b - cost1;
				if (0 <= money && q1 <= money / c2 + i) {
					ans1 = i;
					ans2 = money / c2;
					break;
				}
			}
			
			if (0 < ans1 && 0 <= ans2) {
				System.out.println(ans1 + " " + ans2);
			} else {
				System.out.println("NA");
			}
		}
	}
}