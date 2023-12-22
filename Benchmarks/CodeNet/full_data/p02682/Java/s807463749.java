import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int A = scn.nextInt();
			int B = scn.nextInt();
			int C = scn.nextInt();
			int K = scn.nextInt();

			int result = 0;
			boolean flg = false;

			if(K <= A) {
				result = K;
				flg = true;
			} else {
				result = A;
				K -= A;
			}

			if(!flg) {
				if(K <= B) {
					flg = true;
				} else {
					K -= B;
					result = result - K;
				}
			}
			System.out.println(result);
		}
	}
}