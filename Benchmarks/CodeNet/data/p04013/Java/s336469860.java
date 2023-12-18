

import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int ave=sc.nextInt();
		int[] num=new int[N];

		for(int i=0; i<N; i++) {
			num[i]=sc.nextInt();
		}

		int[][][] goukei=new int[N+1][N*50+1][N+1];
		boolean[][][] bbnwa=new boolean[N+1][N*50+1][N+1];
		int[][][] maisu=new int[N+1][N*50+1][N+1];

		for(int i=0; i<=N; i++) {
			for(int j=0; j<N*50+1; j++) {
				for(int k=0; k<=N; k++) {
					goukei[i][j][k]=0;
					bbnwa[i][j][k]=false;
					maisu[i][j][k]=0;
				}
			}
		}

		goukei[0][0][0]=1;
		bbnwa[0][0][0]=true;


		for(int i=0; i<N; i++) {
			for(int j=0; j<N*50+1; j++) {
				for(int k=0; k<N; k++) {
					if(bbnwa[i][j][k]==true) {
						bbnwa[i+1][j+num[i]][k+1]=true;		//bbnwa[j]がtrueだと与えられた数字の部分和でjがつくれる
						bbnwa[i+1][j][k]=true;
						goukei[i+1][j+num[i]][k+1]+=goukei[i][j][k];	//goukeiはその部分和の場合の数
						goukei[i+1][j][k]+=goukei[i][j][k];
						maisu[i+1][j][k]=maisu[i][j][k];				//maisuは部分和を達成しているカードの枚数の数
						maisu[i+1][j+num[i]][k+1]=maisu[i][j][k]+1;
					}
				}
			}
		}

		long sousu=0;

		for(int j=1; j<=N; j++) {
			sousu+=goukei[N][j*ave][j];
		}
		System.out.println(sousu);
	}
}