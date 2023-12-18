import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A[]=new int[N];
		long k=0,ans=0;
		for(int i=0;i<N;i++){
			A[i]=stdIn.nextInt();
		}
		for(int i=1;i<N;i++){
			if(i==1)
				k=A[0];
			k=k*A[i]/gcd(k,A[i]);
		}
		for(int i=0;i<N;i++){
			ans+=k/A[i]%1000000007;
		}
		System.out.println(ans);
	}
	static long gcd(long m,long n){
		if(m%n==0)
			return n;
		else
			return gcd(n,m%n);
	}
}
