import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static final int INF = 1 << 31;

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line[] = br.readLine().split(" ");
			int n = Integer.parseInt(line[0]);
			int m = Integer.parseInt(line[1]);
			if(n==0){break;}

			int[][] stone = new int[1000][n+1];
			int[][][] table = new int[1000][n+1][m+1];
			for(int i=0; i<1000; i++){
				for(int j=1; j<=n; j++){
					for(int k=0; k<= Math.min((j/2)+1,m); k++){
						table[i][j][k] = INF;
					}
				}
			}
			if(m > 0){
				for(int i=0; i<1000; i++){
					table[i][1][1] = 0;
				}
			}

			for (int i=0; i<n; i++){
				String info[] = br.readLine().split(" ");
				int num = Integer.parseInt(info[0]);
				for(int j=0; j<num; j++){
					stone[Integer.parseInt(info[2*j+1])-1][i] = Integer.parseInt(info[2*j+2]);
				}
			}

			for(int k=0; k<=m; k++){
				for(int j=1; j<=n; j++){
					for(int i=0; i<1000; i++){
						if(stone[i][j] != 0 || j==n){
							for(int l=0; l<1000; l++){
								if(stone[l][j-1] != 0){
									table[i][j][k] = Math.min(table[i][j][k], ((stone[i][j]+stone[l][j-1]) * Math.abs(i-l)+ table[l][j-1][k]));
								}
								if(j>1 && k>0){
									if(stone[l][j-2] != 0){
										table[i][j][k] = Math.min(table[i][j][k], ((stone[i][j]+stone[l][j-2]) * Math.abs(i-l) + table[l][j-2][k-1]));
									}
								}
							}
						}
					}
				}
			}
			int answer = INF;
			for(int i=0; i<1000; i++){
				for(int k=0; k<=m; k++){
					if(table[i][n][k] != 0){
						answer = Math.min(answer,table[i][n][k]);
					}
				}
			}
			System.out.println(answer);
		}
	}
}