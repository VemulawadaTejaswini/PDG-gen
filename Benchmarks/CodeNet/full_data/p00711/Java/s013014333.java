package AOJ_1130;
import java.util.*;

class Main {
    static char[][] table = new char[31][31];
    static int[][] visited = new int[31][31];
    static int w,h;
    public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	for(;;){
	    w = in.nextInt();
	    h = in.nextInt();
	    if(w == 0 && h == 0) break;
	    for(int i=0;i<31;i++)
		for(int j=0;j<31;j++) visited[i][j] = 0;
	    for(int i=0;i<h;i++){
		String line = in.next();
		for(int j=0;j<w;j++){
		    table[i][j] = line.charAt(j);
		}
	    }
	    for(int i=0;i<h;i++){
		for(int j=0;j<w;j++){
		    if(table[i][j] == '@') dfs(i,j);
		}
	    }
	    int cnt =0;
	    for(int i=0;i<h;i++){
		for(int j=0;j<w;j++){
		    cnt += visited[i][j];
		}
	    }
	    System.out.println(cnt);
	}
    }
    static void dfs(int y, int x){
	int dx[] = {1,0,-1,0};
	int dy[] = {0,1,0,-1};
	visited[y][x] = 1;
	for(int i=0;i<4;i++){
	    int xx = x+dx[i];
	    int yy = y+dy[i];
	    if(xx >= 0 && xx < w && yy >= 0 && yy < h && table[yy][xx] == '.' && visited[yy][xx] == 0)
		dfs(yy,xx);
	}
    }
}