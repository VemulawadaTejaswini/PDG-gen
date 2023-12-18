import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int t[] = new int[N];
		int x[] = new int[N];
		int y[] = new int[N];

		for (int i = 0; i < N; i++) {
			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		boolean flg = true;
		for (int i = 0; i < N; i++) {
			int a = t[i] - x[i] - y[i];
			if(a % 2 == 1 || a < 0) {
				flg = false;
				break;
			}
		}

		if (flg == true)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}