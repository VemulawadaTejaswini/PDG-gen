import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int team = 0;
			int c = sc.nextInt();
			int a = sc.nextInt();
			int n = sc.nextInt();
			while (true) {
				if (c < 1 || a < 1 || n < 1) {
					break;
				}
				team++;
				c--;
				a--;
				n--;
			}
			while(true) {
				if (c < 2 || a < 1) {
					break;
				}
				team++;
				c -= 2;
				a--;
			}
			while(true) {
				if (c < 3) {
					break;
				}
				team++;
				c -= 3;
			}
			System.out.println(team);
		}
		sc.close();
	}
}