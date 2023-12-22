import java.util.Scanner;


public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		while(true){
			int w = s.nextInt();
			int h = s.nextInt();
			if(w == 0 && h == w)break;
			int x = 0;
			int y = 0;
			String tile[][] = new String[h][w];
			for(int i = 0;i < h;i++){
				tile[i] = s.next().split("");
				for(int j = 0;j < w;j++){
					if(tile[i][j].charAt(0) == '@'){
						x = i;
						y = j;
					}
				}
			}
			int chkP[][] = new int[h][w];
			int cnt = cntTile(tile,chkP,'.',x,y);
			System.out.println(cnt);
		}
	}
	
	int cntTile(String[][] panel,int[][] chkP,char tile,int x,int y){
		chkP[x][y] = -1; 
		int cnt = 0;
		if(x + 1 < panel.length    && chkP[x + 1][y] != -1 && panel[x + 1][y].charAt(0) == tile)cnt += cntTile(panel,chkP,tile,x + 1,y);
		if(x     > 0               && chkP[x - 1][y] != -1 && panel[x - 1][y].charAt(0) == tile)cnt += cntTile(panel,chkP,tile,x - 1,y);
		if(y + 1 < panel[x].length && chkP[x][y + 1] != -1 && panel[x][y + 1].charAt(0) == tile)cnt += cntTile(panel,chkP,tile,x,y + 1);
		if(y     > 0               && chkP[x][y - 1] != -1 && panel[x][y - 1].charAt(0) == tile)cnt += cntTile(panel,chkP,tile,x,y - 1);
		cnt++;
		return cnt;
	}
	
	public static void main(String args[]){
		new Main().run();
	}
}