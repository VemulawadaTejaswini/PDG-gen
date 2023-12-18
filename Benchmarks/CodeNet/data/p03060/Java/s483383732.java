import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] V = new int[N];
		for (int i=0;i<N;i++) {
			V[i] = sc.nextInt();
		}

		int[] C = new int[N];
		for (int i=0;i<N;i++) {
			C[i] = sc.nextInt();
		}

		int MAX=0;
		for (int i=0;i<N;i++) {
			if(V[i]>C[i]) {
				MAX += V[i]-C[i];
			}
		}

		System.out.println(MAX);

	}
}