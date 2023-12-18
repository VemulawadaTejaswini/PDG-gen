import java.util.Scanner;

/**
 * https://abc044.contest.atcoder.jp/tasks/arc060_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long s = sc.nextLong();
		sc.close();
		
		long ans = -1;
		if(s==n){
			ans = n+1;
		}
		long sqrt = (long)Math.sqrt(n);
		if(ans==-1){
			for(long b=2; b<=sqrt; b++){
				if(s==compute(n,b)){
					ans = b;
					break;
				}
			}
		}	
		if(ans==-1){
			for(long p=sqrt; p>=1; p--){
				long b = (n-s+p)/p;
				if(s==compute(n,b)){
					ans = b;
					break;
				}
			}	
		}
		System.out.println(ans);
	}

	private static long compute(long n, long b) {
		long sum = 0;
		while(n>0){
			sum += n%b;
			n = n/b;
		}
		return sum;
	}

}