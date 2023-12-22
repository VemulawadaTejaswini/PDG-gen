import java.util.*;
class Main{
    int dx[]={-1,0,1,0};
    int dy[]={0,1,0,-1};
    boolean[][][] map;
    class P{
	int y,x;
	P(int y,int x){
	    this.y=y;this.x=x;
	}
    }
    void run(){
	Scanner sc=new Scanner(System.in);
	while(true){
	    int w=sc.nextInt();
	    int h=sc.nextInt();
	    map=new boolean[h][w][4];
	    if((w|h)==0)break;
	    for(int i=0;i<h+h-1;i++){
		if(i%2==0){
		    for(int j=0;j<w-1;j++){
			if(sc.nextInt()==0)setWidth(i/2,j);
		    }
		}
		else{
		    for(int j=0;j<w;j++){
			if(sc.nextInt()==0)setHeight(i/2,j);
		    }
		}
	    }
	    System.out.println(BFS(w,h)+1);
	}
    }
    int BFS(int w,int h){
	LinkedList<P> queue=new LinkedList<P>();
	int[][] visited=new int[h][w];
	queue.offer(new P(0,0));
	while(!queue.isEmpty()){
	    P p=queue.poll();
	    int y=p.y;int x=p.x;
	    for(int i=0;i<4;i++){
		int ny=y+dy[i];int nx=x+dx[i];
		if(map[y][x][i]&&visited[ny][nx]==0){
		    queue.offer(new P(ny,nx));
		    visited[ny][nx]=visited[y][x]+1;
		    if(ny==h-1&&nx==w-1)return visited[ny][nx];
		}
	    }
	}
	return -1;
    }
    void setWidth(int a,int b){
	map[a][b][2]=true;
	map[a][b+1][0]=true;
    }
    void setHeight(int a,int b){
	map[a][b][1]=true;
	map[a+1][b][3]=true;
    }
    public static void main(String[] args){
	new Main().run();
    }
}