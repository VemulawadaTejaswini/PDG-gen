import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		int T = sc.nextInt();
		int Bis = 0;
		int Time = 0;
		while (Time < T + 0.5) {
			Bis += B;
			Time += A;
		}

		System.out.println(Bis);

		sc.close();
	}
};

