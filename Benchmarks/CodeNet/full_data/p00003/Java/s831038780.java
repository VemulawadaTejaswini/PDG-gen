import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			int[] A = new int[3];
			for(int j = 0; j < 3; j++) {
				A[j] = Integer.parseInt(sc.next());
			}

			Arrays.sort(A);
			double a = Math.pow(A[2], 2);
			double b = Math.pow(A[0], 2) + Math.pow(A[1], 2);
			if(a == b) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		sc.close();
	}

}

