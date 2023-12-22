
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;


class Main{
	public static void main(String[] args){
		Solve s = new Solve();
		s.solve();
	}	
}

class Solve{
	Solve(){}
	

	void solve(){
		Scanner in = new Scanner(System.in);

		int m = in.nextInt();

		for(int i = 0; i < m; i++){
			int sx =in.nextInt(), sy = in.nextInt(), w = in.nextInt(), h = in.nextInt();
			int n = in.nextInt(), ans = 0;
			for(int j = 0; j < n; j++){
				int x = in.nextInt(), y = in.nextInt();
				if(x >= sx && y >= sy && x <= sx + w && y <= sy + h) ans++;
			} 
			System.out.println(ans);
		}
		
		
	}
	

}