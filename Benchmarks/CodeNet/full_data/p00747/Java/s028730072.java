import java.util.*;

public class Main{

    int h,w;
    int[][] map;
    int[][] wall_h;
    int[][] wall_s;

    class P{
	int x,y;
	P(int x, int y){
	    this.x = x;
	    this.y = y;
	}
    }

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    w = sc.nextInt();
	    h = sc.nextInt();
	    if(w==0 && h==0) break;

	    map = new int[h][w];
	    wall_h = new int[h][w-1];
	    wall_s = new int[h-1][w];
	    for(int i=0; i<h*2-1; i++){
		if(i%2==0){
		    for(int j=0; j<w-1; j++) wall_h[i/2][j] = sc.nextInt();
		}else{
		    for(int j=0; j<w; j++) wall_s[i/2][j] = sc.nextInt();
		}
	    }

	    bfs();

	    System.out.println(map[h-1][w-1]);
	}
    }

    void bfs(){
	LinkedList<P> list = new LinkedList<P>();
	list.add(new P(0,0));
	map[0][0] = 1;
	while(list.size()>0){
	    P p = list.poll();
	    int x = p.x, y = p.y;
	    if(y+1<h && map[y+1][x]==0 && wall_s[y][x]==0){
		map[y+1][x] = map[y][x]+1;
		list.add(new P(x,y+1));
	    }
	    if(y-1>=0 && map[y-1][x]==0 && wall_s[y-1][x]==0){
		map[y-1][x] = map[y][x]+1;
		list.add(new P(x,y-1));
	    }
	    if(x+1<w && map[y][x+1]==0 && wall_h[y][x]==0){
		map[y][x+1] = map[y][x]+1;
		list.add(new P(x+1,y));
	    }
	    if(x-1>=0 && map[y][x-1]==0 && wall_h[y][x-1]==0){
		map[y][x-1] = map[y][x]+1;
		list.add(new P(x-1,y));
	    }
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}