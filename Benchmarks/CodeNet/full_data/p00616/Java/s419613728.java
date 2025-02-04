import java.util.Scanner;

//Cubes Without Holes
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int h = sc.nextInt();
			if((n|h)==0)break;
			int[][] c = new int[n+1][n+1];
			boolean[][][] used = new boolean[n+1][n+1][3];
			while(h--!=0){
				String p = sc.next();
				int a = sc.nextInt();
				int b = sc.nextInt();
				if(p.equals("xy")&&!used[a][b][0]){
					used[a][b][0] = true;
					c[b][a] = n;
				}
				else if(p.equals("xz")&&!used[a][b][1]){
					used[a][b][1] = true;
					for(int i=1;i<=n;i++)c[a][i]=Math.min(n, c[a][i]+1);
				}
				else if(!used[a][b][2]){
					used[a][b][2] = true;
					for(int i=1;i<=n;i++)c[i][a]=Math.min(n, c[i][a]+1);
				}
			}
			int s = n*n*n;
			for(int i=1;i<=n;i++)for(int j=1;j<=n;j++)s-=c[i][j];
			System.out.println(s);
		}
	}
}