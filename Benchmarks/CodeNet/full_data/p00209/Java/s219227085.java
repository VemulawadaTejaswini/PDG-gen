import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0) break;
			
			int[][] map = new int[n][n];
			int[][][] piece = new int[4][m][m];
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					map[i][j] = sc.nextInt();
				}
			}
			for(int i=0;i<m;i++){
				for(int j=0;j<m;j++){
					piece[0][i][j] = sc.nextInt();
					piece[1][j][m-1-i] = piece[0][i][j];
					piece[2][m-1-i][m-1-j] = piece[0][i][j];
					piece[3][m-1-j][i] = piece[0][i][j];
				}
			}
			
			int count;
			int x = -1;
			int y = -1;
			int z = -1;
			for(int p=0;p<=n-m;p++){
				for(int q=0;q<=n-m;q++){
					for(int k=0;k<4;k++){
						count = 0;
						for(int i=0;i<m;i++){
							for(int j=0;j<m;j++){
								if(piece[k][i][j]==-1){
									count++;
								}else{
									if(piece[k][i][j]==map[p+i][q+j]) count++;
									else{
										i = m;
										j = m;
									}
								}
							}
						}
						if(count==m*m){
							y = p;
							x = q;
							z = k;
							k = 4;
							p = n;
							q = n;
						}
					}
				}
			}
			
			if(x==-1){
				System.out.println("NA");
			}else{
				for(int i=0;i<m;i++){
					for(int j=0;j<m;j++){
						if(piece[z][i][j]!=-1){
							System.out.println((x+j+1) + " " + (y+i+1));
							i = m;
							j = m;
						}
					}
				}
			}
				
		}
	}
}