package abc94C;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] X = new int[N];
		int[] index = new int[N];
		int tmp;
		int tmpI;

		for(int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
			index[i] = i;
		}

		for(int i = 0; i < N-1; i++) {
			for(int j = i+1; j < N; j++) {
				if(X[i] > X[j]) {
					tmp = X[i];
					tmpI = index[i];
					X[i] = X[j];
					index[i] = index[j];
					X[j] = tmp;
					index[j] = tmpI;
				}
			}
		}
		int ansL = X[N/2 + 1];
		int ansR = X[N/2];


		for(int i = 0; i < N; i++) {
			if(X[index[i]] < N/2) {
				System.out.println(ansL);
			} else {
				System.out.println(ansR);
			}
		}

	}
}
