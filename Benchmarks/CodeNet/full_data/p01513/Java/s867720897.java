import java.util.*;

class Main{
	public static void main(String args[]){
		Solve s = new Solve();
		s.solve();
	}
}

class Solve{
	Scanner in = new Scanner(System.in);

	void solve(){
		while(in.hasNext()) {
			int n = in.nextInt();
			if(n == 0) return;
			ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
			for(int i = 0; i< n; i++) {
				int m = in.nextInt();
				ArrayList<Integer> a = new ArrayList<Integer>();
				for(int j = 0 ; j < m; j++) {
					int t = in.nextInt();
					a.add(t);
				} 
				al.add(a);
			}
			int k = in.nextInt();
			boolean[] f = new boolean[1001];
			for(int i = 0; i < k; i++){
				int t = in.nextInt();
				f[t] = true;
			}
			int ans = 0;
			for(int i = 0; i < n; i++){
				int cnt = 0;
				for(int j = 0; j < al.get(i).size(); j++){
					if(f[al.get(i).get(j)]) cnt++;
				}
				if(cnt == k){
					if(ans == 0) ans = i + 1;
					else ans = -1;
				}
			}
			if(ans == 0) ans = -1;
			System.out.println(ans);
		}
	}
}