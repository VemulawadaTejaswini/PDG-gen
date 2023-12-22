import java.util.*;
public class Main {
	static int cnt;
	static char[][] map = new char[21][21];
	static int w,h;
	static int dfs(int y, int x, char[][] v){
		  int my[] = {-1,0,1,0};
		  int mx[] = {0,-1,0,1};
		  int ret = 1;
		  for(int i=0;i<4;i++){
			    int ny = y + my[i], nx = x + mx[i];
			    if(0<=ny&&ny<h&&0<=nx&&nx<w && v[ny][nx] == '.'){
			      v[ny][nx] = '#';
			      ret += dfs(ny, nx, v);
			    }
		  }
		  return ret;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w+h==0)break;
			String[] str = new String[h];
			for(int i=0;i<h;i++){
				str[i] = sc.next();
				for(int j=0;j<w;j++){
					map[i][j] =str[i].charAt(j);
				}					
			}
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(map[i][j]=='@')System.out.println(dfs(i,j,map));
				}
			}
		}
		
	}

}