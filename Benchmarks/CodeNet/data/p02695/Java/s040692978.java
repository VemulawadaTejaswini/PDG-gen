import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	static int n;
	static int m;
	static int q;
	static int a[];
	static int b[];
	static int c[];
	static int d[];
	static int ans;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		q = sc.nextInt();

		a = new int[q];
		b = new int[q];
		c = new int[q];
		d = new int[q];

		for (int i=0; i<q; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}

		ans = 0;

		LinkedList<Integer> def = new LinkedList<Integer>();
		def.add(1);
		dfs(def);

		System.out.println(ans);
	}

	public static void dfs(LinkedList<Integer> A){
		if (A.size() == n+1){
			int score = 0;

			for (int i=0; i<q; i++){
				if (A.get(b[i]) - A.get(a[i]) == c[i]){
					score += d[i];
				}
			}

			ans= Math.max(score, ans);
			return;
		}

		A.add(A.getLast());
		while (A.getLast() <= m){
			dfs((LinkedList<Integer>)A.clone());
			A.set(A.size()-1, A.getLast()+1);
		}
	}
}