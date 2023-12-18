
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Pair{
		int i;
		int cnt;
		public Pair(int i, int cnt) {
			this.i=i;
			this.cnt=cnt;
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<ArrayList<Integer>> a = new ArrayList<>();
		for(int i=0; i<=n; i++) {
			a.add(new ArrayList<Integer>());
		}
		for(int i=0; i<m; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			a.get(s).add(t);
		}
		ArrayDeque<Pair> stack = new ArrayDeque<Pair>();
		stack.add(new Pair(1,0));
		boolean ok = false;

		while(!stack.isEmpty()) {
			Pair p = stack.pop();
			if(p.i == n && p.cnt == 2) {
				ok=true;
				break;
			}
			for(int t : a.get(p.i)) {
				stack.add(new Pair(t, p.cnt+1));
			}
		}
		if(ok) {
			System.out.println("POSSIBLE");
		} else {
			System.out.println("IMPOSSIBLE");
		}
		sc.close();
	}
}
