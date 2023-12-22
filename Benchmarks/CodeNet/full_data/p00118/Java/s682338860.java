import java.util.Scanner;

//Property Distribution
public class Main{

	static int h, w;
	static int[][] move = {{0,1},{0,-1},{1,0},{-1,0}};
	static char[][] m;
	
	static void dfs(int i, int j, char c){
		m[i][j] = '.';
		for(int k=0;k<4;k++){
			int ni = i+move[k][0];
			int nj = j+move[k][1];
			if(0<=ni&&ni<h&&0<=nj&&nj<w&&m[ni][nj]==c)dfs(ni,nj,c);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			h = sc.nextInt();
			w = sc.nextInt();
			if((h|w)==0)break;
			m = new char[h][w];
			for(int i=0;i<h;i++)m[i]=sc.next().toCharArray();
			int x = 0;
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(m[i][j]!='.'){
						x++;
						dfs(i,j,m[i][j]);
					}
				}
			}
			System.out.println(x);
		}
	}
}