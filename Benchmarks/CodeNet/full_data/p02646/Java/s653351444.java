import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int v = sc.nextInt();
		int b = sc.nextInt();
		int w = sc.nextInt();
		int t = sc.nextInt();

		if (a < b) {
			for (int i = 0; i < t; i++) {
				a += v;
				b += w;
				if (a == b) {
					break;
				}
			}
		} else if (a > b) {
			for (int i = 0; i < t; i++) {
				a -= v;
				b -= w;
				if (a == b) {
					break;
				}
			}
		}

		if (a == b) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		sc.close();
	}

}