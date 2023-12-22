import java.util.*;
import java.lang.StringBuffer;
import java.math.BigInteger;

class node {
	int x,y;
	public node (int x,int y){
		this.x=x;
		this.y=y;
	}
}

public class Main {
	static char map[][] = new char [110][110];
	static int h,w;
	static Queue <node> Q = new LinkedList <node> ();
	static int ans = 0;
	static int dx[] = {1,-1,0,0};
	static int dy[] = {0,0,-1,1};

	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			 w =scanner.nextInt();
			 h =scanner.nextInt();
			scanner.nextLine();
			if(w==0&&h==0){
				break ;
			}

			for(int i=0;i<h;i++){
				String s = scanner.nextLine();
				for(int j=0;j<w;j++){
					map[i][j]=s.charAt(j);
				}
			}

			BFS();

		}
		
		
	}

	public static void BFS(){
		int v[][] = new int [h][w];
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(v[i][j]==0){
					ans++;
					char aim = map[i][j];
					node t = new node (i,j);
					if(Q.size()!=0)  {Q.clear();}
					Q.offer(t);
					while(Q.size()!=0){
						node tem = Q.poll();
						int x = tem.x;
						int y = tem.y;
						for(int k=0;k<4;k++){
							int xx = x+dx[k];
							int yy = y+dy[k];
							if(xx>=0&&xx<h&&yy>=0&&yy<w&&map[xx][yy]==aim&&v[xx][yy]==0){
								v[xx][yy]=1;
								node temp = new node (xx,yy);
								Q.offer(temp);
							}
						}
					}
					
				}
				
			}
		}
		
		
		System.out.println(ans);

	}
}