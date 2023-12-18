import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int kotae;
		int Mini;
		Mini = 0;

		int N = sc.nextInt();
		int X = sc.nextInt();

		int [] M;
		M = new int[N];

		for (int i = 0; i < N; i++){
			M[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++){
			X = X - M[i];
		}

		for (int i = 0; i < (N - 1); i++){
			if (M[i] < M[i + 1]){
				Mini = M[i];
			} else {
				Mini = M[i + 1];
			}
		}

		kotae = X / Mini + N;

		System.out.println(kotae);

	}
}
