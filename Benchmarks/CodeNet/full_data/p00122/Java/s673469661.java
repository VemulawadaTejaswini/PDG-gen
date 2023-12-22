
import java.util.Scanner;
import java.util.ArrayList;


class Main{

	

	public static void main(String[] args){
		Solve s = new Solve();
		s.solve();
	}
	
}

class Solve{
	Solve(){}

	int[] dx = {-1, 0, 1, 2, 2, 2, 1, 0, -1, -2, -2, -2};
	int[] dy = {-2, -2, -2, -1, 0, 1, 2, 2, 2, 1, 0, -1};
	int[] ddx ={-1, 0, 1, 1, 1, 0, -1, -1, 0};
	int[] ddy ={-1, -1, -1, 0, 1, 1, 1, 0, 0};

	boolean f;
	int n;
	ArrayList<Integer> vx, vy;

	void solve(){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int sx = in.nextInt(), sy = in.nextInt();
			if(sx == 0 && sy == 0) return;
			n = in.nextInt();
			f = false;
			vx = new ArrayList<Integer>();
			vy = new ArrayList<Integer>();
			for(int i = 0; i < n; i++){
				int x = in.nextInt(), y = in.nextInt();
				vx.add(x);
				vy.add(y);
			}
			dfs(sx, sy, 0);
			if(f) System.out.println("OK");
			else System.out.println("NA");
		}
	}

	void dfs(int x, int y, int k){
		if(k == n) {
			f = true;
			return;
		}
		for(int i = 0; i < 12; i++){
			int nx = x + dx[i],ny = y + dy[i];
			if(nx > 0 && ny > 0 && nx < 10 && ny < 10){
				for(int j = 0; j < 9; j++){
					if(nx + ddx[j] == vx.get(k) && ny + ddy[j] == vy.get(k)) {
						dfs(nx, ny, k + 1);
					}
				}
			}
		}
	}

}