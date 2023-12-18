import java.util.Scanner;

public class Main {

	public static int A;
	public static int B;
	public static int C;

	public static void main(String[] args) {
		init();
		if ((A == B && B != C) || (B == C && C != A) || (C == A && A != B)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	public static void init() {
		Scanner sc = new Scanner(System.in);
		try {
			A = sc.nextInt();
			B = sc.nextInt();
			C = sc.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
