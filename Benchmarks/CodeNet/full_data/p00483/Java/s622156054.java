import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int M=sc.nextInt();
		int N=sc.nextInt();

		int roops=sc.nextInt();
		int[][] Js=new int[M+1][N+1];
		int[][] Os=new int[M+1][N+1];
		int[][] Is=new int[M+1][N+1];

		for(int i=0; i<=M; i++) {
			Js[i][0]=0;
			Os[i][0]=0;
			Is[i][0]=0;
		}
		for(int i=0; i<=N; i++) {
			Js[0][i]=0;
			Os[0][i]=0;
			Is[0][i]=0;
		}

		String a="";

		for(int i=1; i<=M; i++) {
			a=sc.next();
			for(int j=1; j<=N; j++) {
				if(a.charAt(j-1)=='J') {
					Js[i][j]=1;
					Os[i][j]=0;
					Is[i][j]=0;
				}
				else if(a.charAt(j-1)=='O') {
					Js[i][j]=0;
					Os[i][j]=1;
					Is[i][j]=0;
				}
				if(a.charAt(j-1)=='I') {
					Js[i][j]=0;
					Os[i][j]=0;
					Is[i][j]=1;
				}
			}
		}
		for(int i=0; i<=M; i++) {
			for(int j=1; j<=N; j++) {
				Js[i][j]=Js[i][j-1]+Js[i][j];
				Os[i][j]=Os[i][j-1]+Os[i][j];
				Is[i][j]=Is[i][j-1]+Is[i][j];
			}
		}

		for(int i=1; i<=M; i++) {
			for(int j=0; j<=N; j++) {
				Js[i][j]=Js[i-1][j]+Js[i][j];
				Os[i][j]=Os[i-1][j]+Os[i][j];
				Is[i][j]=Is[i-1][j]+Is[i][j];
			}
		}

		for(int i=0; i<roops; i++) {
			int sM=sc.nextInt();
			int sN=sc.nextInt();
			int gM=sc.nextInt();
			int gN=sc.nextInt();

			int j_ans=Js[gM][gN]-Js[gM][sN-1]-Js[sM-1][gN]+Js[sM-1][sN-1];
			int o_ans=Os[gM][gN]-Os[gM][sN-1]-Os[sM-1][gN]+Os[sM-1][sN-1];
			int i_ans=Is[gM][gN]-Is[gM][sN-1]-Is[sM-1][gN]+Is[sM-1][sN-1];

			System.out.println(j_ans+" "+o_ans+" "+i_ans);
		}
	}
}
