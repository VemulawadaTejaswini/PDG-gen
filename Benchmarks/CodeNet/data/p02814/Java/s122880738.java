import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		int M = sc.nextInt();
		long N = sc.nextLong();
		long[] a = new long[M+1];
		long all = 1;
		for(int i = 0;i< M;i++){
			a[i] = sc.nextLong();
			all = all * a[i] / gcd(all, a[i]);
		}
		all = all * a[M-1] / gcd(all, a[M-1]);
		sc.close();
		int flag = 0;
		for(int i = 0;i < M;i++){
			if(all/a[i]%2==0){
				System.out.println(0);
				break;
			}else{
				flag++;
			}
		}
		if(flag == M){
			System.out.println((2*N/all+1)/2);
		}
	}


	private static long gcd(long m, long n) {
	   //if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    long r = m%n;
	    return gcd(n, r);
	}
}