import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int result = 0;

		if(A < B) {
			if(B < C) {
				result = C * 10 + B + A;
			} else {
				result = B * 10 + C + A;
			}
		} else {
			if(A < C) {
				result = C * 10 + B + A;
			} else {
				result = A * 10 + B + C;
			}
		}

		System.out.println(result);

		return;
	}

}
