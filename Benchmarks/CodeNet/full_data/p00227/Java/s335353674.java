import java.util.*;
import static java.util.Arrays.*;

class Main {

	int[] ns;
	int n, m;

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			n = in.nextInt();
			m = in.nextInt();
			if(n == 0) return;
			ns = new int[n];
			for(int i=0; i<n; i++)
				ns[i] = in.nextInt();
			System.out.println(solve());
		}
	}
	

	int solve(){
		int ans = 0;
		sort(ns);
		for(int i=0; i<n; i++)if(i%m != m-1)
			ans += ns[n-i-1];
		return ans;
	}
	
	public static void main(String args[]){
		new Main().run();
	}
}