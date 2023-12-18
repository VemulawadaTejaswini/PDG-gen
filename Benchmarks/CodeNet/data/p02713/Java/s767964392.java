import java.util.*;

public class Main {
	
	static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
	
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int k=Integer.parseInt(scan.next());
		long sum=0;
		for (int i=1;i<=k;++i) {
			for (int j=1;j<=k;++j) {
				for (int p=1;p<=k;++p) {
					sum+=gcd(gcd(i,j),p);
				}
			}
		}
		System.out.print(sum);
	
}
}
//end
