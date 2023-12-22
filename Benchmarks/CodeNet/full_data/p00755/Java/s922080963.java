import java.util.Arrays;
import java.util.Scanner;
public class Main {
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
							for(int i = 0;i < h;i++){
								workP[i] = Arrays.copyOf(p[i],p[i].length);
							}
							//System.out.println(t1 + " " + t2 + " " + t3 + " " + t4 );
							changeColor(workP,t1,0,0,1);
							changeColor(workP,t2,0,0,1);
							changeColor(workP,t3,0,0,1);
							changeColor(workP,t4,0,0,1);
							changeColor(workP,c,0,0,1);
							int cnt = 0;
							for(int i = 0;i < h;i++){
								for(int j = 0;j < w;j++){
									cnt = cntWColor(workP,c,0,0);}}
							max = Math.max(max,cnt);
							/*
							System.out.println(cnt);
							System.out.println(t1 +":" +t2 +":" +t3 + ":" +t4 +":" + cnt);
							for(int i = 0;i < workP.length;i++){
								for(int j = 0;j < workP[i].length;j++){
									System.out.print(workP[i][j] + " ");
								}
								System.out.println();
							}
							*/
						}
					}
				}
			}
			System.out.println(max);
		}
	}

	int[][] changeColor(int[][] panel,int color,int x,int y,int dir){
		if(dir != 0 && x + 1 < panel.length && panel[x+1][y] == panel[x][y])
			panel = changeColor(panel,color,x+1,y,1);
		if(dir != 1 && x > 0 && panel[x-1][y] == panel[x][y])
			panel = changeColor(panel,color,x-1,y,0);
		if(dir != 2 && y + 1 < panel[x].length && panel[x][y+1] == panel[x][y])
			panel = changeColor(panel,color,x,y+1,3);
		if(dir != 3 && y > 0 && panel[x][y-1] == panel[x][y])
			panel = changeColor(panel,color,x,y-1,2);
		panel[x][y] = color;
		return panel;
	}

	int cntWColor(int[][] panel,int color,int x,int y){
		int cnt = 0;
		if(x + 1 < panel.length){
			if(panel[x+1][y] == panel[x][y])cnt += cntWColor(panel,color,x+1,y);
		}
		if(y + 1 < panel[x].length){
			if(panel[x][y+1] == panel[x][y])cnt += cntHColor(panel,color,x,y+1);
		}
		cnt++;
		return cnt;
	}

	int cntHColor(int[][] panel,int color,int x,int y){
		int cnt = 0;
		if(y + 1 < panel[x].length){
			if(panel[x][y+1] == panel[x][y])cnt += cntHColor(panel,color,x,y+1);
		}
		cnt++;
		return cnt;
	}

	public static void main(String args[]){
		new Main().run();
	}
}