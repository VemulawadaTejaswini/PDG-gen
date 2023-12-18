import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	boolean[] v;
	private int scoreSub(int node) {
		if(v[node]) {
			return 0;
		}
		v[node] = true;
		
		List<Integer> edges = tree.get(node);
		int result = 0;
		for(int e : edges) {
			if(!v[e]) {
			result += Math.min(d[node],	d[e]);
			result += scoreSub(e);
			}
		}
		return result;
	}
	private int score() {
		v = new boolean[N+1];
		return scoreSub(1);
	}
	
	int N;
	List<List<Integer>> tree;
	int[] c;
	int[] d;
	
	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		N = sc.nextInt();
		
		tree = new ArrayList<>();
		for(int i=0;i<=N;i++) {
			tree.add(new ArrayList<>());
		}
		
		for(int i=1;i<N;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			tree.get(a).add(b);
			tree.get(b).add(a);
		}

		c = new int[N+1];
		for(int i=1;i<=N;i++) {
			c[i] = sc.nextInt();
		}
		
		{
			List<List<Integer>> z = new ArrayList<>();
			for(int i=0;i<N;i++) {
				int numOfNode = tree.get(i+1).size();
				z.add(Arrays.asList(i+1, numOfNode));
			}
			
			z.sort((z1,z2) -> Integer.compare(z1.get(1), z2.get(1)));
			
			int[] c2 = new int[N+1];
			System.arraycopy(c, 0, c2, 0, c.length);
			Arrays.sort(c2);
			
			d = new int[N+1];
			for(int i=1;i<=N;i++) {
				d[z.get(i-1).get(0)] = c2[i];
			}
			
		}
		

		int m = score();
		
		out.println(m);
		String sep = "";
		for(int i=1;i<=N;i++) {
			out.print(sep + d[i]);
			sep = " ";
		}
		out.println();
		
		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
