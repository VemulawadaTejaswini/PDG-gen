import java.util.*;
public class Main {
	static int[] a = new int [50];
	static int[] b = new int [50];
	static int[] c = new int [50];
	static int[] d = new int [50];
	static int n,m,q;
	static int ans = 0;
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		n = Integer.parseInt(scan.next());
		m = Integer.parseInt(scan.next());
		q = Integer.parseInt(scan.next());

		for (int i = 0;i < q; ++i){
			a[i] = Integer.parseInt(scan.next());
			b[i] = Integer.parseInt(scan.next());
			c[i] = Integer.parseInt(scan.next());
			d[i] = Integer.parseInt(scan.next());
		}
		Vector<Integer> vec = new Vector<>();
		vec.add(1);
		dfs(vec);
		System.out.print(ans);
	}

	static void dfs(Vector<Integer> A){
		A = new Vector<Integer>(A);
		if (A.size() == n+1){
			int score = 0;
			for (int i = 0;i < q; ++i){
				if (A.get(b[i]) - A.get(a[i]) == c[i] )score += d[i];
				ans = Math.max(ans, score);
			}
		}else{
			int tmp;
			A.add(A.lastElement());
			while(A.lastElement() <= m){
				dfs(A);
				tmp = A.lastElement()+1;
				A.remove(A.size()-1);
				A.add(tmp);
			}
		}
	}
}

//end