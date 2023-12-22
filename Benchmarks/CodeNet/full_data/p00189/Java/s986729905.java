import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		final int INF = Integer.MAX_VALUE/10;

		Scanner scan = new Scanner(System.in);
		while(true){
			int e=scan.nextInt();
			if(e==0)
				break;


			int[] a = new int[e];
			int[] b = new int[e];
			int[] c = new int[e];

			int v = 0;

			for(int i=0;i<e;i++){
				a[i] = scan.nextInt();
				b[i] = scan.nextInt();
				c[i] = scan.nextInt();
				v = Math.max(a[i],b[i]);
			}
			v++;

			int[][] cost = new int[v][v];
			for(int i=0;i<v;i++)
				for(int j=0;j<v;j++)
					cost[i][j]=(i==j ? 0:INF);

			for(int i=0;i<e;i++){
				cost[a[i]][b[i]] = cost[b[i]][a[i]] = c[i];
			}

			int[] sum = new int[v];

			int[][] d = new int[v][v];

			for(int i=0;i<v;i++)
				for(int j=0;j<v;j++)
					d[i][j]=cost[i][j];

			for(int k=0;k<v;k++)
				for(int i=0;i<v;i++)
					for(int j=0;j<v;j++)
						d[i][j]=Math.min(d[i][j], d[i][k]+d[k][j]);

			for(int i=0;i<v;i++)
				for(int j=0;j<v;j++)
					sum[i]+=d[i][j];

			int ans=v-1;
			for(int i=v-1;i>=0;i--)
				if(sum[ans]>=sum[i])
					ans=i;

			System.out.println(ans+" "+sum[ans]);
		}
	}

}