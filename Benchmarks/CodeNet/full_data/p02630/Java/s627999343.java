import java.util.*;
import java.util.function.BiConsumer;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i=0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		int Q = sc.nextInt();
		
		int B[] = new int[Q];
		int C[] = new int[Q];
		for(int i=0; i < Q; i++) {
			B[i] = sc.nextInt();
			C[i] = sc.nextInt();
		}
		
		long total = 0;
		for(int a : A) {
			total += a;
		}
		
		int[] num = new int[100001];
		for(int i=0; i<100001; i++) {
			for(int j=0; j<N; j++) {
				if(A[j] == i) num[i] ++;
			}
		}
		
		
		for(int i=0; i < Q; i++) {
			int b = B[i];
			int c = C[i];
			int count = num[b];
			total += (c - b) * count;
			num[c] += num[b];
			num[b] = 0;			
			System.out.println(total);
	
		}

		
	}
}
