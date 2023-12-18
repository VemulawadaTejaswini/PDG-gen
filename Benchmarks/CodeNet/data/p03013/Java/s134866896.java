import java.util.Scanner;
public class Main {

	static long ln = 1000000007;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		long fibdp[] = new long[n+1];
		fibdp[0] = 1;
		fibdp[1] = 1;
		for(int i=2;i<=n;i++) {
			fibdp[i] = fibdp[i-1] + fibdp[i-2];
		}
		int a[] = new int[m];
		for(int i=0;i<m;i++) {
			a[i] = sc.nextInt();
		}
		long ans = fib(a[0] -1, fibdp)% ln;
		for(int i=1;i<m;i++) {
			ans = ans * fib(a[i]-a[i-1]-2, fibdp)% ln;
		}
		if(m!=0)
			ans = ans * fib(n - a[m-1] -1, fibdp)% ln;
		
		System.out.print(ans);
	}
	
	public static long fib(int i, long[] fibdp) {
		if(i<0)
			return 0;
		else 
			return fibdp[i];
	}
}