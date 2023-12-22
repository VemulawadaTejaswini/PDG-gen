import java.util.BitSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static int w, h;
	public static char[][][] map = new char[50][50][2];
	public static final int[] dx = {1, 0, -1, 0};
	public static final int[] dy = {0, 1, 0, -1};
	public static int[] gx = new int[2];
	public static int[] gy = new int[2];
	public static int[] sx = new int[2];
	public static int[] sy = new int[2];
	public static BitSet used = new BitSet(50*50*50*50);
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			w = in.nextInt();
			h = in.nextInt();
			if(w == 0) break;
//			map = new char[2][h][w];
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
			used.clear();
			Queue<Integer> qu = new LinkedList<Integer>();
			qu.add(set(sy[0], sx[0], sy[1], sx[1]));
			used.set(id(qu.peek()));
			boolean goal = false;
			while(!qu.isEmpty()){
				int p = qu.poll();
				int y1 = p>>18;
				int x1 = (p>>12)&mask;
				int y2 = (p>>6)&mask;
				int x2 = p&mask;
				if(goal(y1, x1, y2, x2)){
					goal = true;
					break;
				}
				if(oneGoal(y1, x1, y2, x2)) continue;
				for(int i=0; i<4; i++){
					int np = move(y1, x1, y2, x2, i);
					int id = id(np);
					if(used.get(id)) continue;
					used.set(id);
					qu.add(np);
				}
			}
			System.out.println(goal?"Yes":"No");
		}
	}
	
	public static int set(int y1, int x1, int y2, int x2){
		return y1<<(6+6+6) | x1<<(6+6) | y2<<6 | x2;
	}
	
	public static int move(int y1, int x1, int y2, int x2, int dir){
		int nx1 = x1+dx[dir];
		int ny1 = y1+dy[dir];
		if(out(ny1, nx1) || map[0][ny1][nx1] == '#'){
			nx1 = x1;
			ny1 = y1;
		}
		int nx2 = x2-dx[dir];
		int ny2 = y2+dy[dir];
		if(out(ny2, nx2) || map[1][ny2][nx2] == '#'){
			nx2 = x2;
			ny2 = y2;
		}
		return set(ny1, nx1, ny2, nx2);
	}
	
	public static boolean out(int y, int x){
		return x < 0 || x >= w || y < 0 || y >= h;
	}
	
	public static boolean goal(int y1, int x1, int y2, int x2){
		return x1 == gx[0] && y1 == gy[0] && x2 == gx[1] && y2 == gy[1];
	}
	
	public static boolean oneGoal(int y1, int x1, int y2, int x2){
		return x1 == gx[0] && y1 == gy[0] || x2 == gx[1] && y2 == gy[1];
	}
	
	public static int id(int y1, int x1, int y2, int x2){
		return y1*h*w*w + x1*h*w + y2*w + x2;
	}
	
	public static final int mask = (1<<6)-1;
	public static int id(int hash){
		return (hash>>18)*h*w*w + ((hash>>12)&mask)*h*w + ((hash>>6)&mask)*w + (hash&mask);
	}
}