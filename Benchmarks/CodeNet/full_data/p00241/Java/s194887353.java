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
		int[][] s = {{1,2,3,4},{2,-1,4,-3},{3,-4,-1,2},{4,3,-2,-1}};
		int n = in.nextInt();
		for(int k = 0; k < n; k++){
			int[] a = new int[4];
			int[] b = new int[4];
			long[] ans = new int[4];
			for(int i = 0; i < 4; i++) a[i] = in.nextInt();
			for(int i = 0; i < 4; i++) b[i] = in.nextInt();

			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 4; j++){
					int t = s[i][j], d = 1;
					if(t < 0){
						t = -t;
						d = -1;
					}
					--t;
					ans[t] += (long)d * a[i] * b[j];
				}
			}

			for(int i = 0; i < 4; i++){
				if(i != 0) System.out.print(" ");
				System.out.print(ans[i]);
			}
			System.out.println();
		}
	}
	
}