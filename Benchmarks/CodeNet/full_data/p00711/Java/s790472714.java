import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		Scanner scn = new Scanner(System.in);
		PrintWriter pr = new PrintWriter(System.out);
		while(true){
			int W = scn.nextInt();
			int H = scn.nextInt();
			int count=0;
			if(W==0&&H==0) break;
			char[][] map = new char[H+2][W+2];
			for(int x=0;x<H+2;x++){
				for(int y=0;y<W+2;y++){
					map[x][y]='#';
				}
			}
			int startx=1;
			int starty=1;
			for(int x=1;x<H+1;x++){
				String tmp=scn.next();
				for(int y=1;y<W+1;y++){
					map[x][y]=tmp.charAt(y-1);
					if(map[x][y]=='@'){
						startx=x;
						starty=y;
					}
					if(map[x][y]=='.'){
						count++;
					}
				}
			}
			mapcount(map,startx,starty);
			for(int x=1;x<H+1;x++){
				for(int y=1;y<W+1;y++){
					if(map[x][y]=='.'){
						count--;
					}
				}
			}
			pr.println(count+1);
		}
		pr.flush();
		scn.close();
	}

	private static void mapcount(char[][] map, int startx, int starty) {
		if(map[startx][starty+1]=='.'){
			map[startx][starty+1]='#';
			mapcount(map,startx,starty+1);
		}
		if(map[startx+1][starty]=='.'){
			map[startx+1][starty]='#';
			mapcount(map,startx+1,starty);
		}
		if(map[startx][starty-1]=='.'){
			map[startx][starty-1]='#';
			mapcount(map,startx,starty-1);
		}
		if(map[startx-1][starty]=='.'){
			map[startx-1][starty]='#';
			mapcount(map,startx-1,starty);
		}
		
	}

}