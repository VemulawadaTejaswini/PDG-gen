import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		for(int i=1;i<k+1;i++) {
			System.out.println(factr(k-1,k-i,i-1)*factr(n-k+1,n-k-i+1,i)%1000000007);
		}
	}
	
	static long factr(long n,long p,long q) {
		if(n==p) {
			return 1l;
		}
		long ma = Math.max(p, q);
		long mi = Math.min(p, q);
		long ret = fact(n,ma)/fact(mi,0);
		return ret;
	}
	static long fact(long n,long m) {
		if(n==m) {
			return 1l;
		}
		return (n*fact(n-1,m));
	}
}