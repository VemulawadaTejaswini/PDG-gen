import java.util.Scanner;


public class Main {
	static boolean[][] board;
	static int[] xx = {1,0,-1,0};
	static int[] yy = {0,1,0,-1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			board = new boolean[12][12];
			for(int j=0; j<12; j++){
				String s = sc.next();
				for(int k=0; k<12; k++){
					if(s.charAt(k)=='1')board[j][k]=false;
					else board[j][k]=true;
				}
			}
			int count=0;
			for(int j=0; j<12; j++){
				for(int k=0; k<12; k++){
					if(!board[j][k]){
						count++;
						dfs(k,j);
					}
				}
			}
			System.out.println(count);
		}
	}
	
	static void dfs(int x, int y){
		if(board[y][x])return;
		else{
			board[y][x]=true;
			for(int i=0; i<4; i++){
				int nextx = x+xx[i];
				int nexty = y+yy[i];
				if(nextx>=0 && nextx<12 && nexty>=0 && nexty<12){
					dfs(nextx,nexty);
				}
			}
		}
	}
}