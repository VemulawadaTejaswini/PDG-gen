import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A[]=new int[N+1];
		long key[]=new long[N+1];
		long ans=0,sum=1,cout=0;
		for(int i=0;i<N+1;i++){
			A[i]=stdIn.nextInt();
		}
		ans=A[N];key[N]=A[N];
		for(int i=N-1;i>=0;i--){
			key[i]=key[i+1]+A[i];
			ans+=key[i];
		}
		for(int i=0;i<N+1;i++){
			if(i!=N&&A[i]+1>sum){
				System.out.println(-1);
				System.exit(0);
			}
			if(i==N&&A[i]>sum){
				System.out.println(-1);
				System.exit(0);
			}
			else
				if(key[i]>sum){
					ans-=key[i]-sum;key[i]=sum;
				}
			sum=(key[i]-A[i])*2;
		}
		System.out.println(ans);
	}
}
