import java.util.*;
import java.math.*;
public class Main{
	static int max;
	static int[] dx={0,1,-1};
	static int[] dy={1,0,0};
	static int h;
	static int w;
	static char[][] map;
	static boolean[][] mm;
	static int[][] c;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		h=sc.nextInt();
		w=sc.nextInt();
		map=new char[h][w];
		for(int i=0; i<h; i++){
			String s=sc.next();
			for(int j=0; j<w; j++){
				map[i][j]=s.charAt(j);
			}
		}
		int ans=0;
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				mm=new boolean[h][w];
				c=new int[h][w];
				max=0;
				Queue<Integer> q=new ArrayDeque<>();
				q.add(i);
				q.add(j);
				while(!q.isEmpty()){
					int x=q.poll();
					int y=q.poll();
					mm[x][y]=true;
					for(int k=0; k<3; k++){
						int xx=x+dx[k];
						int yy=y+dy[k];
						if(xx>=0 && xx<h && yy>=0 && yy<w && map[xx][yy]=='.' && !mm[xx][yy]){
							q.add(xx);
							q.add(yy);
							c[xx][yy]=c[x][y]+1;
							max=Math.max(max,c[xx][yy]);
						}
					}
				}
				ans=Math.max(ans,max);
			}
		}
		System.out.println(ans);
	}
}
