import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static final int[] dx = {0, 1, 1, 0, -1, -1};
	public static final int[] dy = {1, 1, 0, -1, -1, 0};
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int t = in.nextInt();
			int n = in.nextInt();
			if(t==0 && n == 0) break;
			boolean[][] block = new boolean[200][200];
			for(int i=0; i<n; i++){
				int x = in.nextInt()+100;
				int y = in.nextInt()+100;
				block[y][x] = true;
			}
			int sx = in.nextInt()+100;
			int sy = in.nextInt()+100;
			boolean[][] used = new boolean[200][200];
			Queue<Pos> qu = new LinkedList<Pos>();
			qu.add(new Pos(sy, sx, 0));
			int count = 0;
			while(!qu.isEmpty()){
				Pos p = qu.poll();
				if(used[p.y][p.x]) continue;
				if(p.turn > t) continue;
				used[p.y][p.x] = true;
				count++;
				for(int i=0; i<6; i++){
					int ny = p.y + dy[i];
					int nx = p.x + dx[i];
					if(block[ny][nx]) continue;
					qu.add(new Pos(ny, nx, p.turn+1));
				}
			}
			System.out.println(count);
		}
	}
}

class Pos{
	int x, y;
	int turn;
	public Pos(int y, int x, int turn){
		this.y = y;
		this.x = x;
		this.turn = turn;
	}
}