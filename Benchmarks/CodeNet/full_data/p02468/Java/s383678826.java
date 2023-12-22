import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		long m = stdIn.nextInt();
		long n = stdIn.nextInt();
		long k = m;
		for(int i=2;i<=n;i++){
			k = k * m;
			if(k>1000000007){
				k = k % 1000000007;
				long y = k;
				long x = n / i;
				for(long j=2;j<x;j++){
					k = (k * y)%1000000007;
				}
				for(long j=2;j<n%i;j++){
					k = (k*m)%1000000007;
				}
				break;
			}
		}
		System.out.println(k);
	}

}