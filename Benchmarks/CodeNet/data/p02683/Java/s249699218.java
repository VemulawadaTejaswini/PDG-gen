import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int M=stdIn.nextInt();
		int X=stdIn.nextInt();
		int C[]=new int[N];
		int A[][]=new int[N][M];
		boolean key[]=new boolean[N];
		int min=10000000;
		for(int i=0;i<N;i++){
			C[i]=stdIn.nextInt();
			for(int j=0;j<M;j++){
				A[i][j]=stdIn.nextInt();
			}
		}
		for(int i=0;i<Math.pow(2,N);i++){
			int a=i,cout=0,ans=0;
			int b[]=new int[M];
			for(int j=0;j<N;j++){
				if(a%2==1)
					key[j]=true;
				a/=2;
			}
			for(int j=0;j<N;j++){
				if(key[j]){
					ans+=C[j];
					for(int k=0;k<M;k++){
						b[k]+=A[j][k];
						if(b[k]>=X){
							cout++;b[k]=-10000000;
						}
					}
				}
			}
			key=new boolean[N];
			if(cout==M&&ans<min)
				min=ans;
		}
		if(min==10000000)
			System.out.println(-1);
		else
			System.out.println(min);
	}
}
