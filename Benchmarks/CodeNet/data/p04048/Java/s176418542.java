import java.util.Scanner;

class Main{
	static long f(long n,long k){
		if(gcd(n,k)!=1) return gcd(n,k)*f(n/gcd(n,k),k/gcd(n,k));
		else{
			if(n%2==1) return 3*n-3;
			else{
				long ans=3*n-3;
				return ans-3*(Math.min(k,n-k)-1);
			}
		}
	}
	static long gcd(long x,long y){
		if(Math.max(x,y)%Math.min(x,y)==0) return Math.min(x,y);
		else return gcd(Math.min(x,y),Math.max(x,y)%Math.min(x,y));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			long n=sc.nextLong();
			long x=sc.nextLong();
			System.out.println(f(n,x));
		}
	}
}