import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long K=sc.nextLong();
		long A=sc.nextLong();
		long B=sc.nextLong();

		if(A>=B) {
          	long ans=K+1;
			System.out.println(ans);		//ビスケットを交換しないでそのままため続けたほうが良い
		}
		else if(A<B) {	//交換したほうがお得なとき
			long res=K-A;
			long ans=(B-A)*((res)/2)+A;
			if(res%2==0) {
             	ans=Math.max(ans,K+1);
				System.out.println(ans);
			}
			else {
				ans=(B-A)*(1+(res+1)/2);
              	ans=Math.max(ans,K+1);
				System.out.println(ans);
			}
		}
	}
}