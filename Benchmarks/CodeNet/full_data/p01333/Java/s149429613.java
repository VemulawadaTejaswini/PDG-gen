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
		int[] c = {1000,500,100};
		while(in.hasNext()){
			int n = in.nextInt(), m = in.nextInt();
			if(n == 0 && m == 0) return;

			int[] ans = new int[3];

			n = m - n;
			for(int i = 0; i < 3; i++){
				ans[i] = n /c[i];
				n %= c[i];
			}

			System.out.println(ans[2] + " " + ans[1] + " " + ans[0]);
		}
	}
	
}

// while(in.hasNext()){
		// 	int n = in.nextInt();
		// 	if(n == 0) return;
			
		// }