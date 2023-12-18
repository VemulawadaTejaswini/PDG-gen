import java.util.*;

// CODEFES_B 2017-C
// http://code-festival-2017-qualb.contest.atcoder.jp/tasks/code_festival_2017_qualb_c	

public class Main {

	public static void main (String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		
		Edge10[] edges = new Edge10[M];
		
		for (int i = 0; i < M; i++) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			edges[i] = new Edge10(a, b);
		}
		
		boolean isBipartite = true;
		ArrayList<Integer> black = new ArrayList<Integer>();
		ArrayList<Integer> white = new ArrayList<Integer>();
		
		for (int i = 0; i < M && isBipartite; i++) {
			Edge10 edge = edges[i];
			
			if ((black.contains(edge.a) && black.contains(edge.b)) || (white.contains(edge.a) && white.contains(edge.b))) {
				isBipartite = false;
			} else if (black.contains(edge.a) && !white.contains(edge.b)) {
				white.add(edge.b);
			} else if (white.contains(edge.a) && !black.contains(edge.b)) {
				black.add(edge.b);
			} else if (black.contains(edge.b) && !white.contains(edge.a)) {
				white.add(edge.a);
			} else if (white.contains(edge.b) && !black.contains(edge.a)) {
				black.add(edge.a);
			} else {
				black.add(edge.a);
				white.add(edge.b);
			}
		}
		
		
		if (isBipartite) {
			System.out.println(black.size() * white.size() - M);
		} else {
			System.out.println((N * (N - 1)) / 2 - M);
		}
	}
	
	
}

class Edge10 {
	int a;
	int b;
	
	public Edge10(int a, int b) {
		this.a = a;
		this.b = b;
	}
}