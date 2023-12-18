import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] T = new long[N];
		long[] A = new long[N];

		
		for(int i = 0; i < N; i++) {
			T[i] = sc.nextLong();
			A[i] = sc.nextLong();
		}
		
		long t = T[0];
		long a = A[0];
		
		for(int i = 1; i < N; i++) {
			if(T[i] >= A[i]) {
				if((a * T[i]) % A[i] == 0) {
					if((a * T[i]) / A[i] >= t) {
						t = (a * T[i]) / A[i];
					} else {
						long x = (a * T[i]) / A[i];
						long y = 1;
						long temp = x;
						while(temp < t) {
							temp += x;
							y++;
						}
						t = temp;
						a *= y;
					}
				} else {
					for(long j = 1; j <= A[i]; j++) {
						if((a + j) % A[i] == 0) {
							a += j;
							t = (a * T[i]) / A[i];
							break;
						}
					}
					if((a * T[i]) / A[i] >= t) {
						t = (a * T[i]) / A[i];
					} else {
						long x = (a * T[i]) / A[i];
						long y = 1;
						long temp = x;
						while(temp < t) {
							temp += x;
							y++;
						}
						t = temp;
						a *= y;
					}
				}
			} else {
				if((t * A[i]) % T[i] == 0) {
					if((t * A[i]) / T[i] >= a) {
						a = (t * A[i]) / T[i];
					} else {
						long x = (t * A[i]) / T[i];
						long y = 1;
						long temp = x;
						while(temp < a) {
							temp += x;
							y++;
						}
						a = temp;
						t *= y;
					}
				} else {
					for(long j = 1; j <= T[i]; j++) {
						if((t + j) % T[i] == 0) {
							t += j;
							a = (t * A[i]) / T[i];
							break;
						}
					}
					if((t * A[i]) / T[i] >= a) {
						a = (t * A[i]) / T[i];
					} else {
						long x = (t * A[i]) / T[i];
						long y = 1;
						long temp = x;
						while(temp < a) {
							temp += x;
							y++;
						}
						a = temp;
						t *= y;
					}
				}
			}
		}
		System.out.println(t + a);
	}
}
