import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int A = scn.nextInt();
			int B = scn.nextInt();
			int C = scn.nextInt();
			int D = scn.nextInt();

			int result = 0;
			while(true) {
				C = C - B;
				if(C < 1) {
					result = 0;
					break;
				}
				A = A - D;
				if(A < 1) {
					result = 1;
					break;
				}
			}

			if(result == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}