import java.util.Scanner;

public class Main {
	static boolean[][] obs;//true:障害あり
	static int[][] map;//0:到達しない1:到達する
	static void visit(int x, int y, int turn) {
		if(! obs[x][y]) {
			map[x][y]=1;
			if(turn>0) {
				turn--;

				visit(x+1, y, turn);
				visit(x+1, y+1, turn);
				visit(x, y+1, turn);
				visit(x-1, y, turn);
				visit(x-1, y-1, turn);
				visit(x, y-1, turn);
			}
		}
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int t=sc.nextInt();//ターン数
				int n=sc.nextInt();//障害物数
				if(t+n==0) break;
				
				obs=new boolean[61][61];
				map=new int[61][61];
				
				for(int i=0; i<n; i++) {
					int x=sc.nextInt();
					int y=sc.nextInt();
					obs[x+30][y+30]=true;
				}
				int startx=sc.nextInt()+30;
				int starty=sc.nextInt()+30;
				map[startx][starty]=1;
				
				int nowx=startx;
				int nowy=starty;
				visit(nowx, nowy, t);
				int ans=0;
				for(int i=0; i<=60; i++) {
					for(int j=0; j<=60; j++) {
						ans+=map[i][j];
					}
				}
				System.out.println(ans);
			}


		}
	}
}
