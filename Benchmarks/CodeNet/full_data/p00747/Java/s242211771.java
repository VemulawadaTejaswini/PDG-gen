import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    Point[][] map;
    int[][] route;
    int w, h;
    int x, y;
    LinkedList<int[]> que;
    // r, l, d, u
    int[] dirX = { 1, -1, 0, 0 };
    int[] dirY = { 0, 0, 1, -1 };

    void run(){
	while(sc.hasNext()){
	    w = sc.nextInt();
	    h = sc.nextInt();
	    if(w==0 && h==0) break;
	    map = new Point[h][w];
	    route = new int[h][w];
	    for(int i=0; i<h; i++)
		Arrays.fill(route[i], Integer.MAX_VALUE);
	    putMap();
	
	    solve();
	    System.out.println( route[h-1][w-1]!=Integer.MAX_VALUE
				? route[h-1][w-1] : "0");
	}
    }

    boolean solve(){
	que = new LinkedList<int[]>();
	x = 0; y = 0;
	route[0][0] = 1;
	search(x, y);
	while(!que.isEmpty()){
	    int[] p = que.pollFirst();
	    if(p[0]==w-1 && p[1]==h-1) return true;
	    search(p[0], p[1]);
	}
	return false;
    }

    void search(int x, int y){
	//map[y][x].show();
	if(map[y][x].isVisit()) return;
	map[y][x].visited();
	for(int i=0; i<4; i++){
	    if(!map[y][x].isWall(i)){
		int[] a = { x+dirX[i], y+dirY[i] };
		route[a[1]][a[0]] = Math.min(route[a[1]][a[0]], route[y][x]+1);
		if(!map[a[1]][a[0]].isVisit()) que.add(a);
	    }
	}
    }

    void putMap(){
	// 初期設定
	for(int i=0; i<h; i++)
	    for(int k=0; k<w; k++){
		map[i][k] = new Point(k, i);
		if(i==0) map[i][k].makeWall(3);
		if(i==h-1) map[i][k].makeWall(2);
		if(k==w-1) map[i][k].makeWall(0);
		if(k==0) map[i][k].makeWall(1);
	    }

	// 壁作成
	int a=0, b;
	for(int i=0; i<2*h-1; i++){
	    b = 0;
	    for(int k=0; k<w-1+(i%2); k++){
		if(sc.nextInt()==1){
		    // 横の壁
		    if(i%2==0){
			map[a][b].makeWall(0);
			if(b+1<w)
			    map[a][b+1].makeWall(1);
		    }
		    // 縦の壁
		    else{
			map[a][b].makeWall(2);
			if(a+1<h)
			    map[a+1][b].makeWall(3);
		    }
		}
		b++;
	    }
	    if(i%2==1) a++;
	}
    }
}    

class Point{
    int x, y;
    boolean[] dir; // r, l, d, u;
    boolean visit;

    Point(int a, int b){
	x = a;  y = b;  visit = false;
	dir = new boolean[4];
    }

    void makeWall(int d){ dir[d] = true; } 
    void visited(){ visit = true; } 
   
    boolean isVisit(){ return visit; }
    boolean isWall(int i){ return dir[i]; }

    void show(){
	System.out.print
	    ("----------\n"+x+" "+y+"\n");
	for(int i=0; i<4; i++)
	    System.out.print(dir[i]+" ");
	System.out.println("\n-----------");
    }
}