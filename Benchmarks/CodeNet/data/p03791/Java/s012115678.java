import java.util.Scanner;
class Main{
	static int N;
static final long PRIME=(long)(1e9+7);
	static long fact(int n){
		long f=1;
		for(int i=1;i<=n;i++)f=(f*i)%PRIME;
		
		return f;
		
		
	}
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			//Input
			N=Integer.parseInt(sc.next());
			int[] x= new int[N+1];
			for(int i=1;i<=N;i++)x[i]=Integer.parseInt(sc.next());
			
			//System.out.println("Input has been finished.");
			
			
			
			//calculate
			long ans=1;int irr=0;
			for(int k=1;k<N;k++){
				if(x[k]==2*(k-1-irr)){
					ans=(ans*(k-irr))%PRIME;
					irr++;
				}
			}
			ans=(ans*fact(N-irr))%PRIME;
			System.out.println(ans);
		}
	}
}
