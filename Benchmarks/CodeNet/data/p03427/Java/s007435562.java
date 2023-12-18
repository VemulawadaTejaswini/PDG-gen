import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int ans = count(N);
		long x = 1;
		while(true){
			N -= keta(N,x)*x;
			if(N<=0)break;
			ans = Math.max(ans, count(N));
			x *= 10;
		}
		System.out.println(ans);
		return;
	}
	
	public static int count(long n){
		int ret = 0;
		long x = n;
		while(x!=0){
			ret += x%10;
			x /= 10;
		}
		return ret;
	}
	
	public static long keta(long n,long x){
		return (n/x)%10 + 1;
	}
}