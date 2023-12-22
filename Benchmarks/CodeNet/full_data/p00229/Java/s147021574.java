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
		int[] c = {15,15,7,2,3,-3};
		while(in.hasNext()){
			int[] a = new int[6];
			for(int i = 0; i < 6; i++) a[i] = in.nextInt();
			if(a[5] == 0) return;
			int ans = 100;
			for(int i = 0; i < 6; i++){
				ans += c[i] * a[i];
			}
			ans += (a[0] * 5 + a[1] * 3) * 16;
			System.out.println(ans);
		}
	}
}