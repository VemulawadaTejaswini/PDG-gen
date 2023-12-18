import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int N = stdin.nextInt();
		int k= stdin.nextInt();
		int K[] = new int[N];
		for(int i=0;i<N;i++) {
			K[i] = k;
		}

		int Q = stdin.nextInt();
		int A[] = new int[Q];
		for(int i=0;i<Q;i++) {
			A[i] = stdin.nextInt();
		}
		
		for(int i=0;i<Q;i++) {
			for(int j=1;j<=N;j++) {
				if(A[i] != j) {
					K[j-1] = K[j-1]-1;
				}
			}
		}
		
		for(int i=0;i<N;i++) {
			if(K[i] <=0) {
				System.out.println("No");
			}
			else {
				System.out.println("Yes");
			}
		}
	}
}