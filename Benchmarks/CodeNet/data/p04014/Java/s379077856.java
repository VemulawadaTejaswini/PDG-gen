import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long s = sc.nextLong();
		long ans = Long.MAX_VALUE;
		if(n==s){
			System.out.println(n+1);
			return;
		}
		long a=(long)Math.sqrt(n);
		for(long i = 2; i<=a; i++){
			if(s==co(i,n)){
				System.out.println(i);
				return;
			}
		}
		for(long i=a; i>=1; i--){
			if(co(((n-s)/i)+1,n)==s && ((n-s)/i)+1>1){
				System.out.println(((n-s)/i)+1);
				return;
			}
		}
			System.out.println(-1);
	}
	static long co(long i,long n){
		long re=0;
		while(n>0){
			re+=n%i;
			n/=i;
		}
		return re;
	}
}
