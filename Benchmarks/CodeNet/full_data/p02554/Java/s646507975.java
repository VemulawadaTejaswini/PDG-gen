import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = 1000000007;
		long ans = power(10,n,m);
		long ans1 = power(9,n,m);
		long ans2 = power(8,n,m);
		long ans3 = (ans-(2*ans1)%m+ans2)%m;
		System.out.println(ans3);
	}
	public static long power(long x, long y, long m){
		long res =1;
		x=x%m;
		if(x==0){
			return 0;
		}
		while(y>0){
			if((y&1)==1){
				res=(res*x)%m;
			}
			y=y>>1;
			x=(x*x)%m;
		}
		return res;
	}
}