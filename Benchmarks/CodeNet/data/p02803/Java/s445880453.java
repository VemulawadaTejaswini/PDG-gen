import java.util.*;

class Main {
	Scanner sc;
	int H, W;
	char[] S;
	
	private void calc() {
		sc = new Scanner(System.in);
		H = sc.nextInt()+2;
		W = sc.nextInt()+2;
		StringBuilder s = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < W; i++) sb.append('#');
		s.append(sb);
		for (int i = 0; i < H-2; i++) s.append("#"+sc.next()+"#");
		s.append(sb);
		S = s.toString().toCharArray();
		
		int p = 1 + W;
		for (; p < H*W; p++)
			if (S[p] == '.') break;
		int[] a = farPlaceFrom(p);
		int[] b = farPlaceFrom(a[0]);
		
		System.out.println(b[1]);
	}
	
	private int[] farPlaceFrom(int p) {
		final int[] DIR = new int[] { -W, W, -1, 1 };
		int[] ans = new int[2];
		int[] dist = new int[H*W];
		for (int i = 0; i < H*W; i++) dist[i] = -1;
		Deque<Integer> q = new ArrayDeque<>();
		int max = 0;
		int far = p;
		q.addLast(p);
		dist[p] = 0;
		while(!q.isEmpty()) {
			int v = q.removeFirst();
			for (int i = 0; i < DIR.length; i++) {
				int j = v+DIR[i];
				if (S[j] == '.' && dist[j] < 0) {
					q.addLast(j);
					dist[j] = dist[v]+1;
					if (dist[j] > max) {
						max = dist[j];
						far = j;
					}
				}
			}
		}
		return new int[] {far, max};
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}