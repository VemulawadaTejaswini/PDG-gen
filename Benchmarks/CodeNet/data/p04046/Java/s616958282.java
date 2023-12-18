
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		long ans=0;
		for(int i=0;i<H-A;i++){
			ans+=(rec(B-1+i)/rec(B-1)/rec(i))*(rec(W-B-1+H-1-i)/rec(W-B-1)/rec(H-1-i))%(1000000000+7);
		}
		System.out.println(ans);
	}
	static long rec(int n){
		if(n<=0)return 1;
		long ret=1;
		for(int i=1;i<=n;i++){
			ret*=i;
			ret=ret%(1000000000+7);
		}
		return ret;
	}
}