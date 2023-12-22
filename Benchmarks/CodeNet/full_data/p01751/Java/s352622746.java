import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int t = 0;
		int ans = -1;
		while (true) {
			int nt = t + A;
			while (C < t) C += 60;
			if (t <= C && C <= nt) {
				ans = C;
				break;
			}
			t = nt + B;
			if (t % 60 == 0) break;
		}
		System.out.println(ans);
	}

}