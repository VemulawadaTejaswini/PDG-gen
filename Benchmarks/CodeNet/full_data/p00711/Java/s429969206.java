import java.util.Scanner;
public class Main{
	static char map[][]=new char[20][20];
	static int ans; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int w=sc.nextInt();
			int h=sc.nextInt();
			int x=0,y=0;
			ans=0;
			if(w==0&&h==0)break;
			for(int i=0;i<h;i++){
				String str=sc.next();
				for(int j=0;j<w;j++){
					map[i][j]=str.charAt(j);
					if(map[i][j]=='@'){
						x=j;y=i;
					}
				}
			}
			dfs(x, y, w, h);
			System.out.println(ans);
		}
	}
	
	public static void dfs(int x,int y,int w, int h){
		int x_m[]={1,0,-1,0};
		int y_m[]={0,1,0,-1};
		ans++;
		for(int i=0;i<4;i++){
			int nx=x+x_m[i];
			int ny=y+y_m[i];
			map[y][x]='#';
			if(0<=nx&&0<=ny&&nx<w&&ny<h&&map[ny][nx]=='.'){
				dfs(nx, ny, w, h);
			}
		}
		
	}
}