import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int z=0;z<n;z++){
			int[][] map = new int[10][10];
			int[][] ans = new int[10][10];
			for(int i=0;i<10;i++){
				for(int j=0;j<10;j++){
					map[i][j] = sc.nextInt();
				}
			}
			for(int i=0;i<8;i++){
				for(int j=1;j<9;j++){
					if(map[i][j]==1){
						map[i][j] = 0;
						map[i+1][j-1] = 1-map[i+1][j-1];
						map[i+1][j] = 1-map[i+1][j];
						map[i+1][j+1] = 1-map[i+1][j+1];
						map[i+2][j] = 1-map[i+2][j];
						ans[i+1][j] = 1;
					}
				}
			}
			for(int i=0;i<10;i++){
				for(int j=0;j<10;j++){
					if(j!=0) System.out.print(" ");
					System.out.print(ans[i][j]);
				}
				System.out.println();
			}
		}
	}	
}