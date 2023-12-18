import java.util.Scanner;

public class Main {
	
	public static long recursAvg(int[] ar, int start, int sum) {
		if(ar.length==start){
			if(sum==0){
				return 1;
			}
			return 0;
		}
		return recursAvg(ar, start+1, sum+ar[start]) + recursAvg(ar, start+1, sum);
		//return 0;
	}
	
	public static long f(long b, long n){
		if(n < b)
			return n;
		return f(b, n/b) + n % b;
	}

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long n = scanner.nextLong();
		long s = scanner.nextLong();
		
		long out = -1;
		
		for(int b = 2; b <= Math.min(n, 500000000); b++){
			long fthing = f(b,n);
			if(fthing == s){
				out = b;
				break;
			}
		}
		System.out.print(out);
		
	}

}
