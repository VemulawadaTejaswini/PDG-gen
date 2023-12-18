import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String turn = "A";
		int cnt = 0;
		while(true) {
			if(turn.equals("A")) {
				if(a + 1 == b) {
					a--;
				} else {
					a++;
				}
				if(a == 0) {
					System.out.println("Borys");
					return;
				}
				turn = "B";
			} else {
				if(b - 1 == a) {
					b++;
				} else {
					b--;
				}
				if(b == n + 1) {
					System.out.println("Alice");
					return;
				}
				turn = "A";
			}
			cnt++;
			if(cnt == 1000000) {
				System.out.println("Draw");
				return;
			}
		}
	}
}
