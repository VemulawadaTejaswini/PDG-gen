import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int M=stdIn.nextInt();
		long ans=1,n=N,m=M;
		if(N-M>=-1&&N-M<=1){
			while(N>0){
				ans*=N;
				ans=ans%1000000007;
				N--;
			}
			while(M>0){
				ans*=M;
				ans%=1000000007;
				M--;
			}
			if(n-m==0){
				ans*=2;
				ans%=1000000007;
			}
			System.out.println(ans);
		}
		else
			System.out.println(0);
	}
}