import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int m = sc.nextInt();
			int n = sc.nextInt();
			boolean[][] e = new boolean[m+1][m+1];
			int[] deg = new int[m+1];
			for(int i=0; i<n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				e[y][x] = true;
				deg[y]++;
			}
			for(int i=0;i<m;i++){
				for(int j=1;j<=m;j++) {
					if(deg[j]==0){
						if(i!=m-1 && j==2)continue;
						System.out.println(j);
						deg[j] = -1;
						for(int k=1;k<=m;k++)if(e[k][j]) {
							deg[k]--;
						}
					}
				}
			}
		}
	}
}
