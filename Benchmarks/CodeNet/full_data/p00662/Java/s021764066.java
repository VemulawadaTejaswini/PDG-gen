import java.util.*;
import java.math.*;

class Main{
	public static void main(String[] args){
		Solve s = new Solve();
		s.solve();
	}	
}
//1077
class Solve{
	Solve(){}
	
	Scanner in = new Scanner(System.in);

	void solve(){
		while(in.hasNext()){
			int[] a = new int[3];
			for(int i = 0; i < 6; i++) a[i % 3] += in.nextInt();
			if(a[0] == 0 && a[1] == 0 && a[2] == 0) return;

			int ans = 0;
			for(int i = 0; i < 3; i++){
				ans += a[i] / 3;
				a[i] %= 3;
			}

			int m = Math.min(a[0], Math.min(a[1], a[2]));
			ans += m;

			System.out.println(ans);
		}
	}
	
}

// while(in.hasNext()){
		// 	int n = in.nextInt();
		// 	if(n == 0) return;
			
		// }