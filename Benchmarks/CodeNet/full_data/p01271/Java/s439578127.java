import java.util.BitSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static int w, h;
	public static char[][][] map;
	public static final int[] dx = {1, 0, -1, 0};
	public static final int[] dy = {0, 1, 0, -1};
	public static int[] gx = new int[2];
	public static int[] gy = new int[2];
	public static int[] sx = new int[2];
	public static int[] sy = new int[2];
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			w = in.nextInt();
			h = in.nextInt();
			if(w == 0) break;
			map = new char[2][h][w];
			for(int j=0; j<h; j++){
				for(int i=0; i<2; i++){
					map[i][j] = in.next().toCharArray();
					for(int k=0; k<w; k++){
						if(map[i][j][k] == '%'){
							gx[i] = k;
							gy[i] = j;
						}else if(map[i][j][k] == 'L' || map[i][j][k] == 'R'){
							sx[i] = k;
							sy[i] = j;
						}
					}
				}
			}
			BitSet used = new BitSet(h*h*w*w);
			Queue<Pos> qu = new LinkedList<Pos>();
			qu.add(new Pos(sy[0], sx[0], sy[1], sx[1]));
			used.set(qu.peek().id);
			boolean goal = false;
			while(!qu.isEmpty()){
				Pos p = qu.poll();
				if(goal(p)){
					goal = true;
					break;
				}
				if(oneGoal(p)) continue;
				for(int i=0; i<4; i++){
					Pos np = move(p, i);
					if(used.get(np.id)) continue;
					used.set(np.id);
					qu.add(np);
				}
			}
			System.out.println(goal?"Yes":"No");
		}
	}
	
	public static Pos move(Pos p, int dir){
		int nx1 = p.x1+dx[dir];
		int ny1 = p.y1+dy[dir];
		if(out(ny1, nx1) || map[0][ny1][nx1] == '#'){
			nx1 = p.x1;
			ny1 = p.y1;
		}
		int nx2 = p.x2-dx[dir];
		int ny2 = p.y2+dy[dir];
		if(out(ny2, nx2) || map[1][ny2][nx2] == '#'){
			nx2 = p.x2;
			ny2 = p.y2;
		}
		return new Pos(nx1, ny1, nx2, ny2);
	}
	
	public static boolean out(int y, int x){
		return x < 0 || x >= w || y < 0 || y >= h;
	}
	
	public static boolean goal(Pos p){
		return p.x1 == gx[0] && p.y1 == gy[0] && p.x2 == gx[1] && p.y2 == gy[1];
	}
	
	public static boolean oneGoal(Pos p){
		return p.x1 == gx[0] && p.y1 == gy[0] || p.x2 == gx[1] && p.y2 == gy[1];
	}
	
	public static int id(int y1, int x1, int y2, int x2){
		return y1*h*w*w + x1*h*w + y2*w + x2;
	}
}

class Pos{
	int x1, y1, x2, y2;
	int id;
	public Pos(int y1, int x1, int y2, int x2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		id = Main.id(y1, x1, y2, x2);
	}
}