import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str;
		int[][] points = new int[n][3];
		for(int i=0; i<n; i++) {
			str = br.readLine().split(" ");
			points[i][0] = Integer.parseInt(str[0]);
			points[i][1] = Integer.parseInt(str[1]);
			points[i][2] = Integer.parseInt(str[2]);
		}
		int[][] cost = new int[n+1][3];
		for(int i=1; i<=n; i++) {
			for(int j=0; j<3; j++) {
				for(int p=0; p<3; p++) {
					for(int q=0; q<3; q++) {
						if(p!=q) cost[i][p] = Math.max(cost[i][p], points[i-1][p]+cost[i-1][q]);
					}
				}
				//System.out.print(cost[i][j][0]+"|"+cost[i][j][1]+"|"+cost[i][j][2]+" ");
			}
			//System.out.println();
		}
		int ans = -1;
		for(int j=0; j<3; j++) {
			ans = Math.max(cost[n][j], ans);
		}
		System.out.println(ans);
	}
}
