import java.util.Scanner;
public class Main {
	int chkP[][]; 
	static final int NUM_COLOR = 6;
	void run(){
		Scanner s = new Scanner(System.in);
		while(true){
			int h = s.nextInt();
			int w = s.nextInt();
			int c = s.nextInt();
			if(h == 0 && w == 0 && c == 0)break;
			int p[][] = new int[h][w];
			for(int i = 0;i < h;i++)
				for(int j = 0;j < w;j++)
					p[i][j] = s.nextInt();
			int max = 0;
			for(int t1 = 1;t1 <= NUM_COLOR;t1++){
				for(int t2 = 1;t2 <= NUM_COLOR;t2++){
					for(int t3 = 1;t3 <= NUM_COLOR;t3++){
						for(int t4 = 1;t4 <= NUM_COLOR;t4++){
							int workP[][] = new int[h][w];
							chkP = new int[h][w];
							for(int i = 0;i < h;i++)
								for(int j = 0;j < w;j++)
									chkP[i][j] = 1;
							for(int i = 0;i < h;i++)
								System.arraycopy(p[i], 0, workP[i], 0, p[i].length);
							//System.out.println(t1 + " " + t2 + " " + t3 + " " + t4 );
							workP = changeColor(workP,t1,0,0);
							for(int i = 0;i < h;i++)
								for(int j = 0;j < w;j++)
									chkP[i][j] = 1;
							workP = changeColor(workP,t2,0,0);
							for(int i = 0;i < h;i++)
								for(int j = 0;j < w;j++)
									chkP[i][j] = 1;
							workP = changeColor(workP,t3,0,0);
							for(int i = 0;i < h;i++)
								for(int j = 0;j < w;j++)
									chkP[i][j] = 1;
							workP = changeColor(workP,t4,0,0);
							for(int i = 0;i < h;i++)
								for(int j = 0;j < w;j++)
									chkP[i][j] = 1;
							workP = changeColor(workP,c,0,0);
							for(int i = 0;i < h;i++)
								for(int j = 0;j < w;j++)
									chkP[i][j] = 1;
							int cnt = 0;
							cnt = cntColor(workP,c,0,0);
							max = Math.max(max,cnt);

							
						}
					}
				}
			}
			System.out.println(max);
		}
	}
	
	int[][] changeColor(int[][] panel,int color,int x,int y){
		chkP[x][y] = -1; 
		if(x + 1 < panel.length    ){
			if( chkP[x + 1][y] != -1 ){
				if( panel[x + 1][y] == panel[x][y]){
					panel = changeColor(panel,color,x + 1,y);
				}
			}
		}
		if(x     > 0               ){
			if(chkP[x - 1][y] != -1 ){
				if(panel[x - 1][y] == panel[x][y]){
					panel = changeColor(panel,color,x - 1,y);
				}
			}
		}
		if(y + 1 < panel[x].length ){
			if( chkP[x][y + 1] != -1 ){
				if(panel[x][y + 1] == panel[x][y]){
					panel = changeColor(panel,color,x,y + 1);
				}
			}
		}
		if(y     > 0               ){
			if(chkP[x][y - 1] != -1 ){
				if(panel[x][y - 1] == panel[x][y]){
					panel = changeColor(panel,color,x,y - 1);
				}
			}
		}
		panel[x][y] = color;
		return panel;
	}

	int cntColor(int[][] panel,int color,int x,int y){
		chkP[x][y] = -1; 
		int cnt = 0;
		if(x + 1 < panel.length    && chkP[x + 1][y] != -1 && panel[x + 1][y] == panel[x][y])cnt += cntColor(panel,color,x + 1,y);
		if(x     > 0               && chkP[x - 1][y] != -1 && panel[x - 1][y] == panel[x][y])cnt += cntColor(panel,color,x - 1,y);
		if(y + 1 < panel[x].length && chkP[x][y + 1] != -1 && panel[x][y + 1] == panel[x][y])cnt += cntColor(panel,color,x,y + 1);
		if(y     > 0               && chkP[x][y - 1] != -1 && panel[x][y - 1] == panel[x][y])cnt += cntColor(panel,color,x,y - 1);
		cnt++;
		return cnt;
	}
	
	public static void main(String args[]){
		new Main().run();
	}
}