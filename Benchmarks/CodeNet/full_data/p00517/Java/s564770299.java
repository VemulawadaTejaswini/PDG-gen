import java.util.*;
import java.math.*;

class Main{
	public static void main(String[] args){
		Solve s = new Solve();
		s.solve();
	}	
}

class Solve{
	Solve(){}
	
	Scanner in = new Scanner(System.in);

	void solve(){
		int w = in.nextInt(), h = in.nextInt(), n = in.nextInt();
		int ans = 0;
		int x = in.nextInt(), y = in.nextInt();

		for(int i = 0; i < n -1; i++){
			int nx = in.nextInt(), ny = in.nextInt();

			if(x > nx && y > ny){
				int d = Math.min(x - nx, y - ny);
				ans += d;
				x -= d;
				y -= d;
			}
			else if(x < nx && y < ny){
				int d = Math.min(nx - x, ny - y);
				ans += d;
				x += d;
				y += d;
			}

			ans += Math.abs(x - nx) + Math.abs(y - ny);

			x = nx; y = ny;
		}

		System.out.println(ans);
	}
	
}

// while(in.hasNext()){
		// 	int n = in.nextInt();
		// 	if(n == 0) return;
			
		// }