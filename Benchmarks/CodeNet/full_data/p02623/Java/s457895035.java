import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[M];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0; i < M; i++) {
			B[i] = sc.nextInt();
		}
		long time = 0;
		int ans = 0;
		int temp = 0;
		int cnt = 0;
		out : for(int i = 0; i < N; i++) {
			if(K >= A[i]) {
				K -= A[i];
				if(i == N - 1) {
					for(int j = 0; j < M; j++) {
						if(K >= B[j]) {
							K -= B[j];
							if(j == M - 1) {
								System.out.println(N + M);
								return;
							}
						} else {
							time = K;
							ans = i + 1 + j;
							temp = ans;
							cnt = j;
							break out;
						}
					}
				}
			} else {
				for(int j = 0; j < M; j++) {
					if(K >= B[j]) {
						K -= B[j];
						if(j == M - 1) {
							time = K;
							ans = i + j + 1;
							temp = ans;
							cnt = j + 1;
						}
					} else {
						time = K;
						ans = i + j;
						temp = ans;
						cnt = j;
						break out;
					}
				}
			}
		}
		
		for(int i = N - 1; i >= 0; i--) {
			time += A[i];
			temp--;
			in : for(int j = cnt; j < M; j++) {
				if(time >= B[j]) {
					time -= B[j];
					temp++;
				} else {
					cnt = j;
					break in;
				}
			}
			ans = Math.max(ans, temp);
		}
		System.out.println(ans);
	}
}
