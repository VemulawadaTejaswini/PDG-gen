import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static int n,m,p,a,b,bit;
	static int[] ticket;
	static int[][] edge;
	static double[][] dp;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		for(;;){
			n=cin.nextInt();
			m=cin.nextInt();
			p=cin.nextInt();
			a=cin.nextInt();
			b=cin.nextInt();

			if(n+m+p+a+b==0)break;
			dp=new double[m+1][1<<8];
			for(int i=0;i<=m;i++){
				Arrays.fill(dp[i],Double.MAX_VALUE);
			}
			dp[a][0]=0.0;
			bit=0;
			ticket=new int[n];
			for(int i=0;i<n;i++){
				ticket[i]=cin.nextInt();
			}
			edge=new int[31][31];
			for(int i=0;i<31;i++){
				Arrays.fill(edge[i],1<<30);
			}
			for(int i=0;i<p;i++){
				int a=cin.nextInt();
				int b=cin.nextInt();
				edge[a][b]=edge[b][a]=cin.nextInt();
				
			}

			PriorityQueue<int[]> q = new PriorityQueue<int[]>(1,
					new Comparator<int[]>(){
						public int compare(int[] a,int[] b){
							return Double.compare(
									dp[a[0]][a[1]],
									dp[b[0]][b[1]]);
//							return Double.compare(a[2], b[2]);
						}
					});
			q.add(new int[]{a,bit});
			while(!q.isEmpty()){
				int[] array=q.poll();
				int city=(int)array[0];
				int used=(int)array[1];
				double cost=dp[city][used];
//				System.out.println(city+" "+Integer.toBinaryString(used)+" "+cost);
				if(dp[city][used]<cost){
					continue;
				}
				for(int i=0;i<=m;i++){
					if(edge[city][i]!=1<<30){
						for(int j=0;j<ticket.length;j++){
							if(((1<<j)&used)==0){
								int uu=(used | 1<<j);
								double cc=cost+(double)edge[city][i]/(double)ticket[j];
//								System.out.println("  "+dp[i][uu]+" "+cc);
								if(dp[i][uu]<cc){
									continue;
								}
								dp[i][uu]=cc;
								q.add(new int[]{i,uu});
							}
						}
					}
				}
			}
			
			double min=Double.MAX_VALUE;
			for(int i=0;i<1<<8;i++)
				if(Double.compare(Double.MAX_VALUE, dp[b][i])!=0)
					min=Math.min(min,dp[b][i]);
			
			if(Double.compare(min,Double.MAX_VALUE)==0){
				System.out.println("Impossible");
			}
			else
				System.out.printf("%.3f\n",min);
		}
	}

}