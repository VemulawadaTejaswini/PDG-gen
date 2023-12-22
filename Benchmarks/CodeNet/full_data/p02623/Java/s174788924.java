import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static void main(String[] aegs) throws IOException{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();

		long[] A = new long[N+1];
		long[] B = new long[M+1];

		A[0]= 0 ;
		B[0]= 0 ;

		for(int i=1;i<N+1;i++)A[i]=sc.nextLong()+A[i-1];
		for(int i=1;i<M+1;i++)B[i]=sc.nextLong()+B[i-1];

		int j = M;
		int count = 0;

		for(int i=0;i<N+1;i++) {
			if(A[i]>K) break;
            while (B[j] > K - A[i]) {
                j -= 1;
            }
			count=Math.max(count,i+j);
		}
		System.out.println(count);

	}
}