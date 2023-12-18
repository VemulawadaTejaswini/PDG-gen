import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long K=sc.nextLong();
		long A=sc.nextLong();
		long B=sc.nextLong();

		if(A>=B) {
			System.out.println((K+1));		//ビスケットを交換しないでそのままため続けたほうが良い
			//最初に1枚持っている
			System.exit(0);
		}
		else if(A<B) {	//交換したほうがお得なとき
			long res=K-(A-1);
			long ans=(B-A)*((res)/2);
			if(res%2==0) {
				ans+=A;
			}
			else {
				ans+=A+1;
			}
			ans=Math.max(ans,K+1);
			System.out.println(ans);
		}
	}
}