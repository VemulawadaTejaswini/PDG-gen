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
 		while(L+1<R) {		
 			int C = (L+R)/2;//このcが実現できるか調べるK
 			int subsum = 0;
 			for(int i=0;i<N;i++) {
 				int base = A[i];
 				int r = N;
 				int l = i-1;
 				while(l+1<r) {
 					int c = (l + r)/2;
 					if(base + A[c]>=C)l=c;
 					else r = c;
 				}
 				if(l-i<0)continue;
 				subsum += 1 + 2*(l-i);
 			}
 			if(subsum>=M) L = C;
 			else R = C;
 		}
 		//Lが最小のX
 		
 		int memosum = 0;
 		int min = Integer.MAX_VALUE;
 		int memo[] = new int[N];
 		for(int i=0;i<N;i++) {
				int base = A[i];
				int r = N;
				int l = i-1;
				while(l+1<r) {
					int c = (l + r)/2;
					if(base + A[c]>=L)l=c;
					else r = c;
				}
				memo[i]=l-i; //到着要素番号が入ってる
				
				if(l-i>=0) {
					memosum += 2*(l-i)+1;
					min = Math.min(min,base+A[l]);
				}
				
			}
 		
 		
 		
 		long sum[] = new long[N+1];
 		for(int i=0;i<N;i++)sum[i+1]=sum[i]+ A[i];
 		
 		long ans = 0;
 		for(int i=0;i<N;i++) {
 			if(memo[i]<0)break;
 				int last = i+memo[i];
 				long tmp = (last-i+1)*2*A[i]+2*(sum[last+1]-sum[i+1]);
 				ans += tmp;
 		}
 		while(memosum>M) {
 			int minus = min; 
 			ans -= minus;
 			memosum--;
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
