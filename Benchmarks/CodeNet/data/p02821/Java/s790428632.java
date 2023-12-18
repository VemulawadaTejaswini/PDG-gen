
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long M = sc.nextLong();
		int A[] = new int[N];
		for(int i=0;i<N;i++)A[i]=sc.nextInt();
 		sc.close();
 		
 		rsort(A);
 		
 		//２数の和がKを越えるものだけ使うことにする。
 		int R = 2*100000 + 100;
 		int L = 0;
 		int memo[] = null;
 		while(L+1<R) {
 			int C = (L+R)/2;//このcが実現できるか調べるK
 			memo = new int[N];
 			long sum = 0;
 			for(int i=0;i<N;i++) {
 				int base = A[i];
 				int r = N;
 				int l = -1;
 				while(l+1<r) {
 					int c = (l + r)/2;
 					if(base + A[c]>=C)l=c;
 					else r = c;
 				}
 				memo[i]=l;
 				sum += 1 + 2*l;
 			}
 			if(sum>=M) L = C;
 			else R = C;
 		}
 		
 		long sum[] = new long[N+1];
 		for(int i=0;i<N;i++)sum[i+1]=sum[i]+A[i];
 		
 		long ans = 0;
 		for(int i=0;i<N;i++) {
 			if(memo[i]<=0)break;
 				int len = memo[i];
 				long tmp = (len+1)*2*A[i]+2*(sum[i+1+len]-sum[i+1]);
 				ans += tmp;
 			}
 		System.out.println(ans);
	}
	
	static void rsort(int[] x) {
		Arrays.sort(x);
		int len = x.length;
		for(int i=0;i<len/2;i++) {
			int tmp = x[i];
			x[i]=x[len-1-i];
			x[len-1-i]=tmp;
		}
	}
}
