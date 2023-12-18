
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		Integer A[]=new Integer [N]; for(int i=0;i<N;i++)A[i]=sc.nextInt();
		int F[]=new int [N]; for(int i=0;i<N;i++)F[i]=sc.nextInt();
		
		Arrays.sort(A,Collections.reverseOrder());
		for(int i=0;i<N;i++)A[i]=A[i].intValue();
		Arrays.sort(F);
		long l=-1, r=(long)Math.pow(10, 12);
		while(r>l+1) {
			long c = l+(r-l)/2;
			boolean ok = func(c,N,A,F,K);
			if(ok)r=c;else l=c;
		}
		System.out.println(r);
	}
	
	static boolean func(long c, int N,Integer[] a, int F[], long K) {
		long sum=0;
		for(int i=0;i<N;i++) {
			sum += Math.max(0, a[i]-c/F[i]);
		}
		return sum<=K;
	}
}
