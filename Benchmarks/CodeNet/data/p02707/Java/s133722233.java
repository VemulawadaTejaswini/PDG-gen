import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
			int N  = sc.nextInt();

			int[] A = new int[N];

			for(int i=1;i<N;i++) {
				int a = sc.nextInt();
				A[a] ++;
			}

				for(int i = 1;i<N+1; i++) {
				System.out.println(A[i]);
			}

	}

}
