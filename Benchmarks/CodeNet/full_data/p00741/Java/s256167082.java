import java.util.*;
public class Main {
	int[][] land;
	int w,h,count;
	int[] dx={-1,-1,-1,0,0,1,1,1},dy={-1,0,1,-1,1,-1,0,1};
	Scanner stdin =new Scanner(System.in);
	
	public void Solve(){
		
		while(true){
			count=0;
			w=stdin.nextInt();
			h=stdin.nextInt();
			
			if(w==0&&h==0) break;
			land=new int[h][w];
			
			
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					land[i][j]=stdin.nextInt();
				}
			}
			
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(land[i][j]==1){
						dfs(i,j);
						count++;
					}
				}
			}
			
			System.out.println(count);
			
			
			
			
			
		}
		
		
	}
	
	public void dfs(int i,int j){
		land[i][j]=0;
		for(int k=0;k<8;k++){
			int xx=i+dx[k];
			int yy=j+dy[k];
			if(0<=xx&&xx<h&&0<=yy&&yy<w){
				if(land[xx][yy]==1) dfs(xx,yy);
				
			}
			
		}
	}
	
	public static void main (String args[]){
		Main m=new Main();
		m.Solve();
	}
	
}