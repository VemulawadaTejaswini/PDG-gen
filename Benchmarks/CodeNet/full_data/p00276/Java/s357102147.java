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
		int q = in.nextInt();
		for(int i = 0; i < q; i++){
			int c = in.nextInt(), a = in.nextInt(), n = in.nextInt();
			int ans = 0;
			int k = Math.min(c, Math.min(a, n));
			ans += k;
			c -= k;
			a -= k;

			k = Math.min(c / 2, a);
			if( k < 0) k = 0;
			ans += k;
			c -= k * 2;

			if(c < 0) c = 0;
			ans += c / 3;

			System.out.println(ans);
		}
	}
	
}

// while(in.hasNext()){
		// 	int n = in.nextInt();
		// 	if(n == 0) return;
			
		// }