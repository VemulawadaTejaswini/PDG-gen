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

	void solve(){
		int n = in.nextInt(), k = in.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = in.nextInt();
		int ans = 0 , t;
		for(int i = 0; i < k; i++){
			ans += a[i];
		}
		t = ans;
		int s = 0;
		for(int i = k; i < n; i++){
			t = t + a[i] - a[s];
			s++;
			ans = Math.max(ans,t);
		}
		System.out.println(ans);
	}
	
	
}