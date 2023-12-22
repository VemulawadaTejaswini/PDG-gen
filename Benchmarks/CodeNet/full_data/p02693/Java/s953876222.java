import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int K = scn.nextInt();
			int A = scn.nextInt();
			int B = scn.nextInt();

			int tmp = K;
			while(tmp < A) {
				tmp = tmp + K;
			}
			if(A <= tmp && tmp <= B) {
				System.out.println("OK");
			} else {
				System.out.println("NG");
			}
		}
	}
}