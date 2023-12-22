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
			int[] x = new int[n];
			int[] w = new int[m];
			for(int i = 0; i < n; i++) x[i] = in.nextInt();
			for(int i = 0; i < m; i++) w[i] = in.nextInt();
			int pos = 0, t = 0;
			for(t = 0; t < m; t++) {
				if(pos >= n) break;
				pos += x[pos];
				pos += w[t];
			}
			System.out.println(t);
		}
	}
	
	
}