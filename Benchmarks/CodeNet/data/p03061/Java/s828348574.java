import java.util.Scanner;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] A = new int[N];
		for (int i = 0; i< N; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		int cnt = 0;

		Outer:
		for (int i = A[1]/2; i>0; i--) {

			if(A[1] % i == 0 || A[0] % i == 0) {
				
				Inner:
				for (int j = 0; j < N; j++) {
					if(A[j] % i != 0) {
						cnt++;
					}
					if(cnt == 2) {
						break Inner;
					}
				}
				if (cnt <= 1) {
					if (A[1] == A[N-1] || A[0] == A[N-2]) {
						System.out.println(A[1]);
					}
					else {
					System.out.println(i);
					break Outer;
					}
				}
				cnt = 0;
			}
		}
	}

	
}	
