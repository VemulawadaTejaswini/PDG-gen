import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		int flag = 0;
		out : while(flag == 0) {
			Arrays.sort(A);
			for(int i = N - 2; i >= 0; i--) {
				if(A[N - 1] % A[i] != 0) {
					if(A[N - 1] % A[i] == 1) {
						System.out.println(1);
						return;
					}
					A[N - 1] %= A[i];
					continue out;
				}
				if(i == 0) {
					flag = 1;
				}
			}
		}
		
		System.out.println(A[0]);
	}
}
