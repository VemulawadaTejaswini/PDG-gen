import java.util.*;
public class Main{
	static int w,h;
	static char map[][]=new char[25][25];
	static int dx[] = {0,1,0,-1};
	static int dy[] = {1,0,-1,0};
	static int[][] kioku =new int[25][25];
	static void dfs(int x,int y){
		if(x<0||x>=w||y<0||y>=h)return;
		if(kioku[y][x]!=0||map[y][x]=='#')return;
		kioku[y][x]=1;
		for(int i=0;i<4;i++){
			dfs(x+dx[i],y+dy[i]);
		}
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			w=in.nextInt();
			h=in.nextInt();
			if(w+h==0)break;
			int sx=0,sy=0;
			for(int i=0;i<h;i++){
				String test = in.next();
				for(int s=0;s<w;s++){
					kioku[i][s]=0;
					map[i][s]=test.charAt(s);
					if(test.charAt(s)=='@'){
						sx=s;sy=i;
					}
				}
			}
			dfs(sx,sy);
			int result = 0;
			for(int i=0;i<h;i++){
				for(int s=0;s<w;s++){
					result += kioku[i][s];
				}
			}
			System.out.println(result);
		}
	}
}