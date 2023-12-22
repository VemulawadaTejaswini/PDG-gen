

import java.util.Scanner;

public class Main{
	int n,m,k;
	int[][] d,d2;
	int V,E;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}
	
	void run(){
		int max=Integer.MAX_VALUE;
		Scanner sc=new Scanner(System.in);
		while(true){
			E=sc.nextInt();
			V=sc.nextInt();
			if(E+V==0)break;
			d=new int[E*2][E*2];
			d2=new int[E*2][E*2];


			for(int i=0;i<E*2;i++){
				for(int j=0;j<E*2;j++){
					d[i][j]=Integer.MAX_VALUE;
					d2[i][j]=Integer.MAX_VALUE;
				}
			}
			for(int i=0;i<E;i++){
				int a=sc.nextInt()-1;
				int b=sc.nextInt()-1;
				int cost=sc.nextInt();
				int time=sc.nextInt();
				d[a][b]=cost;
				d[b][a]=cost;
				d2[a][b]=time;
				d2[b][a]=time;
			}
			for(int i=0;i<E*2;i++){
				for(int j=0;j<E*2;j++){
					for(int k=0;k<E*2;k++){
						if(d[i][k]!=max&&d[k][j]!=max)d[i][j]=Math.min(d[i][j], d[i][k]+d[k][j]);
						if(d2[i][k]!=max&&d2[k][j]!=max)d2[i][j]=Math.min(d2[i][j], d2[i][k]+d2[k][j]);
					}
				}
			}
			k=sc.nextInt();

			for(int i=0;i<k;i++){
				int p=sc.nextInt()-1;
				int q=sc.nextInt()-1;
				int r=sc.nextInt();
				solve(p,q,r);
			}
		}
	}
	
	void solve(int p,int q,int r){
		if(r==0){
			System.out.println(d[p][q]);
		}else{
			System.out.println(d2[p][q]);
		}
	}
}