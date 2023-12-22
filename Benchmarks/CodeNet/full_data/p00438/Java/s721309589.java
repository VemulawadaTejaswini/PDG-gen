import java.util.*;

class Main{
	public static void main(String[] args){
		Solve s = new Solve();
		s.solve();
	}	
}

class Solve{
	Solve(){}
	
	Scanner in = new Scanner(System.in);

	int ans, a, b;
	int[] dx = {0,1};
	int[] dy = {1,0};
	boolean[][] d;

	void solve(){
		while(in.hasNext()){
			a = in.nextInt(); b = in.nextInt();
			if(a == 0 && b == 0) return;
			d = new boolean[a][b];
			int n = in.nextInt();
			for(int i = 0; i < n; i++){
				int x = in.nextInt() - 1, y = in.nextInt() - 1;
				d[x][y] = true;
			}
			ans = 0;
			calc(0,0);
			System.out.println(ans);
		}
	}

	void calc(int x,int y){
		if(x == a - 1 && y == b -1){
			ans++;
			return;
		}
		for(int i = 0; i < 2; i++){
			int nx = x + dx[i], ny = y + dy[i];
			if(nx >= 0 && nx < a && ny >= 0 && ny < b && !d[nx][ny]){
				calc(nx,ny);
			}
		}
	}
	
}