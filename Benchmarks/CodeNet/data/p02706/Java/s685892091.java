import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] A = new int[M];

		for(int i=0;i<M;i++) {
			A[i] = scan.nextInt();
		}

		int homework=0;

		for(int i=0;i<M;i++) {
			homework += A[i];
		}

		if(homework <= N) {
			System.out.println(N-homework);
		}else {
			System.out.println(-1);
		}

		scan.close();
	}

}
