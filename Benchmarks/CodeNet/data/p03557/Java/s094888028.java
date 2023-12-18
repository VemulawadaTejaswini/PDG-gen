import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N + 1];
		int[] B = new int[N + 1];
		int[] C = new int[N + 1];
		
		for(int i = 1; i <= N; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i = 1; i <= N; i++) {
			B[i] = sc.nextInt();
		}
		
		for(int i = 1; i <= N; i++) {
			C[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		
		int count = 0;
		int countC = 0;
		int countB = 0;
		
		for(int i = 1; i <= N; i++) {
			if(A[i] != B[i - 1]) {
				for(int j = 1; j <= N; j++) {
					if(B[j] != B[j - 1]) {
						for(int k = 1; k <= N; k++) {
							if(A[i] < B[j] && B[j] < C[k]) {
								count++;
								countC++;
								countB++;
							}
						}
					} else {
						count += countC;
						if(j < N) {
							if(B[j] != B[j + 1]) {
								countC = 0;
							}
						} else {
							countC = 0;
						}
					}
				}
			} else {
				count += countB;
				if(i < N) {
					if(A[i] != A[i + 1]) {
						countB = 0;
					}
				} else {
					countB = 0;
				}
			}
		}
		System.out.println(count);
	}
}
