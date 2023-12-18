
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	class P{
		int s;
		int t;
		public P(int s, int t) {
			this.s=s;
			this.t=t;
		}
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<P> ans = new ArrayList<>();
		for(int i=0; i<n-1; i++) {
			ans.add(new P(i+1, n));
		}

		ArrayList<P> tmp = new ArrayList<>();
		for(int i=0; i<n-1;i++) {
			for(int j=0; j<i; j++) {
				tmp.add(new P(i+1, j+1));
			}
		}

		int mx = (n-1)*(n-2)/2;
		if(mx<k) {
			System.out.println(-1);
			sc.close();
			return;
		}

		int add = mx-k;

		for(int i=0; i<add; i++) {
			ans.add(tmp.get(i));
		}

		System.out.println(ans.size());
		for(P p : ans) {
			System.out.println(p.s+" "+p.t);
		}
		sc.close();
	}


}
