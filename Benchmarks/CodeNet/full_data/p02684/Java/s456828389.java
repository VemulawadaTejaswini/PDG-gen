import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int N  = stdIn.nextInt();
		int K  = stdIn.nextInt();
		int [] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = stdIn.nextInt();
		}

		int counter = 0;
		int Ai = 0;

		for(int i=0; i<K;i++) {
			Ai = A[Ai];
		}
		System.out.println(Ai);
		stdIn.close();

	}

}
