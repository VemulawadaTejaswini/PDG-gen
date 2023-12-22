import java.util.*;

class Main{

    int h, w;
    int sx, sy, gx, gy;
    int[][] grid;

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){

	    h = sc.nextInt();
	    w = sc.nextInt();
	    if(h==0 && w==0) break;

	    grid = new int[h][w];
	    for(int i=0; i<h; i++){
		for(int j=0; j<w; j++){
		    grid[i][j] = sc.nextInt();
		}
	    }
	    sy = sc.nextInt();
	    sx = sc.nextInt();
	    gy = sc.nextInt();
	    gx = sc.nextInt();

	    System.out.println(bfs());
	}
    }

    class Dice{
	int[] dice = new int[6];
	Dice(int a, int b, int c, int d, int e, int f){
	    dice[0] = a; dice[1] = b; dice[2] = c;
	    dice[3] = d; dice[4] = e; dice[5] = f;
	}
    }

    int[][] dd = {{1,5,2,3,0,4}, {3,1,0,5,4,2}, {4,0,2,3,5,1}, {2,1,5,0,4,3}};

    Dice rotate(Dice d, int idx){
	return new Dice(d.dice[dd[idx][0]], d.dice[dd[idx][1]], d.dice[dd[idx][2]], d.dice[dd[idx][3]], d.dice[dd[idx][4]], d.dice[dd[idx][5]]);
    }

    int[] dx = {0, 1, 0, -1};
    int[] dy = {-1, 0, 1, 0};

    int bfs(){
	//x, y pena
	Queue<int[]> q = new LinkedList<int[]>();
	Queue<Dice> di = new LinkedList<Dice>();
	int[][] v = new int[h][w];
	for(int i=0; i<h; i++) Arrays.fill(v[i], Integer.MAX_VALUE);
	q.add(new int[]{sx, sy, 0});

	Dice d = new Dice(1,2,3,4,5,6);
	di.add(d);
	int min = Integer.MAX_VALUE;

	while(q.size()>0){
	    int[] qq = q.poll();
	    int x = qq[0], y = qq[1], pena = qq[2];
	    Dice ddd = di.poll();

	    if(x==gx && y==gy){
		min = Math.min(min, pena);
		continue;
	    }

	    //System.out.println(x+" "+y);

	    if(v[y][x]<=pena) continue;
	    v[y][x] = pena;

	    for(int i=0; i<4; i++){
		int nx = x + dx[i], ny = y + dy[i];
		if(nx<0 || nx>=w || ny<0 || ny>=h) continue;
		Dice newDice = rotate(ddd, i);
		q.add(new int[]{nx, ny, pena+grid[ny][nx]*newDice.dice[5]});
		di.add(newDice);
	    }
	}

	if(min==Integer.MAX_VALUE) min = -1;
	return min;
    }


    public static void main(String[] args){
	new Main().solve();
    }
}