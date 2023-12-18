import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int C[] = new int[N-1];
		int S[] = new int[N-1];
		int F[] = new int[N-1];

		for (int i=0; i<N-1; i++){
			C[i] = sc.nextInt();
			S[i] = sc.nextInt();
			F[i] = sc.nextInt();
		}

		for (int i=0; i<N-1; i++){

			int time=0;

			for (int j=i; j<N-1; j++){

				if (time <= S[j]){
					time = S[j];
				} else {
					if ((time - S[j]) % F[j] > 0){
						time = ((time - S[j]) / F[j]) * F[j] + F[j];
					}
				}
				time += C[j];

			}

			System.out.println(time);

		}
		System.out.println(0);
	}
}
