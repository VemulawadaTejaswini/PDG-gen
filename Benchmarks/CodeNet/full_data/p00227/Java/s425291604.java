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
		while(in.hasNext()){
			int n = in.nextInt(), m = in.nextInt();
			if(n == 0 && m == 0) return;
			int[] a = new int[n];
			for(int i = 0; i < n; i++) a[i] = -in.nextInt();
			Arrays.sort(a);
			int ans = 0, cnt = 1;
			for(int i = 0; i < n; i++){
				if(cnt != 0) ans -= a[i];
				cnt = (cnt + 1) % m;
			}
			System.out.println(ans);
		}
	}
	
}

// while(in.hasNext()){
		// 	int n = in.nextInt();
		// 	if(n == 0) return;
			
		// }