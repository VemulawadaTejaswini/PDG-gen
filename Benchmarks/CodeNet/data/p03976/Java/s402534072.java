import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		char[] P = new char[N];

//		int tmp = N/K;


		for(int i = 0; i < N ;i++){

			String tmp  = sc.next();
			P[i] = tmp.charAt(0);
		}

		Arrays.sort(P);

		int count = 1;
		int open = 0;
		char a = ' ';

		for(int i = 0; i < N ;i++){

			for (int j = 0; j < N; j++) {

				if(P[j] == ' ') continue;

				if (j == 0) {
					a = P[j];
				} else {
					if(a != P[j]) {
						a = P[j];
						count++;
						P[j] = ' ';
						if (count == K) {
							open += 1;
							count = 1;
							break;
						}
					}
				}
			}
		}

		System.out.println(open);

//		for (int i = 0; i < N ;i++){
//			System.out.println(P[i]);
//		}


		sc.close();
	}
}
