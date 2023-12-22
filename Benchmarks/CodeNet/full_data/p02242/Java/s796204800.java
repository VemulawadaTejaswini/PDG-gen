import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			int n=sc.nextInt();//頂点数
			int inf=100000000;
			int[] d=new int[n+1];//始点からの距離
			int[][] w=new int[n+1][n+1];//各頂点ごとの距離
			Arrays.fill(d, inf);
			for(int i=0; i<n; i++) {
				int u=sc.nextInt();
				int k=sc.nextInt();
				for(int j=0; j<k; j++){
					int v=sc.nextInt();
					int c=sc.nextInt();//辺の重み
					w[u][v]=c;
				}
			}
			d[0]=0;
			for(int t=0; t<n; t++) {
				boolean update=false;
				for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(d[i]<inf && w[i][j]>0) {
							if(d[j]>d[i]+w[i][j]) {
								d[j]=d[i]+w[i][j];
								update=true;
							}
						}
					}
				}
				if(! update) break;
			}
			for(int i=0; i<n; i++) {
				System.out.println(i+" "+d[i]);
			}
		}
	}
}
