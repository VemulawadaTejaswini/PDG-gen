import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A[]=new int[N+1];
		long key[]=new long[N+1];
		long next=1,ans=0,cout=0;
		for(int i=0;i<N+1;i++){
			A[i]=stdIn.nextInt();
			key[i]=next;
			ans+=next;
			next-=A[i];
			if(next<0){
				System.out.println(-1);
				System.exit(0);
			}
			next*=2;
		}
		cout=A[N];ans-=key[N]-A[N];
		for(int i=N-1;i>=0;i--){
			if(key[i]>=cout+A[i]){
				ans-=key[i]-(cout+A[i]);
				if(A[i]>0)
					cout+=A[i];
			}
			else
				cout=key[i];
		}
		if(ans==0)
			System.out.println(-1);
		else
			System.out.println(ans);
	}
}
