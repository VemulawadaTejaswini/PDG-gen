
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long ans=1;
		for(int i=0;i<n;i++){
			ans=lcm(ans,sc.nextLong());
		}
		System.out.println(ans);
	}
	static long gcd(long a,long b){
		if(b==0){
			return a;
		}else{
			return gcd(b,a%b);
		}
	}
	static long lcm(long a,long b){
		return (a>b)?(a/gcd(a,b))*b:(b/gcd(a,b))*a;
	}
}
