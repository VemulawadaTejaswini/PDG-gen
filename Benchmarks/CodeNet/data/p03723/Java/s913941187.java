import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int res = 0;
		if (A == B && B == C) {
			System.out.println(-1);
		}
		while (A % 2 == 0 && B % 2 == 0 && C % 2 == 0) {
			int tmpA = A;
			int tmpB = B;
			int tmpC = C;
			C = tmpA / 2 + tmpB / 2;
			B = tmpA / 2 + tmpC / 2;
			A = tmpC / 2 + tmpB / 2;
			res++;
		}
		System.out.println(res);
	}
}
