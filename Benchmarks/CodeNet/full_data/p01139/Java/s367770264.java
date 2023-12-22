import java.util.*;

class Main{
    int h,w;
    char[][] grid;
    Boolean B,W;
    int countB,countW;
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};

    void solve(){
	Scanner sc = new Scanner(System.in);
	w = sc.nextInt();
	while(w!=0){
	    h = sc.nextInt();
	    grid = new char[h][w];
	    for(int i=0; i<h; i++){
		String line = sc.next();
		grid[i] = line.toCharArray();
	    }

	    countB = 0;
	    countW = 0;
	    for(int i=0; i<h; i++){
		for(int j=0; j<w; j++){
		    if(grid[i][j]=='.'){
			B = false;
			W = false;
			dfs(j,i);
			if(B&&!W)countB++;
			if(!B&&W)countW++;
		    }
		}
	    }

	    System.out.println(countB+" "+countW);

	    w = sc.nextInt();
	}
    }

    void dfs(int x, int y){
	if(B && W)return;
	for(int i=0; i<4; i++){
	    int nx = x+dx[i];
	    int ny = y+dy[i];
	    if(nx<w && nx>=0 && ny<h && ny>=0){
		if(grid[ny][nx]=='B')B = true;
		else if(grid[ny][nx]=='W')W = true;
		else if(grid[ny][nx]=='.'){
		    grid[y][x] = 'x';
		    dfs(nx,ny);
		    grid[y][x] = '.';
		}
	    }
	}
    }
    
    public static void main(String[] args){
	new Main().solve();
    }
}