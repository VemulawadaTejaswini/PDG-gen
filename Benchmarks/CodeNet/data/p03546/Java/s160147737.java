import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int H = Integer.parseInt(in.next());
		int W = Integer.parseInt(in.next());
		DijkstraMatrix d = new DijkstraMatrix(10);
		
		for(int x = 0; x <= 9; x++){
			for(int y = 0; y <= 9; y++){
				d.set(x, y, Integer.parseInt(in.next()));
			}
		}
		int[] shortest = new int[10];
		int[] count = new int[10];
		for(int i = 0;i <= 9; i++){
			shortest[i] = d.getCost(i,1);
			count[i] = 0;
		}
		for(int h = 0; h < H; h++){
			for(int w = 0; w < W; w++){
				int tmp = Integer.parseInt(in.next());
				if(tmp != -1)count[tmp]++;
			}
		}
		int ans = 0;
		for(int i = 0;i <= 9; i++)ans += count[i]*shortest[i];
		System.out.println(ans);
	}
}
class DijkstraMatrix {
	int[][] a;
	boolean[] b;
	PriorityQueue<int[]> q;

	public DijkstraMatrix(int n) {
		a = new int[n + 1][n + 1];
		b = new boolean[n + 1];
		q = new PriorityQueue<int[]>(n + 1, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1];
			}
		});
	}

	public void set(int i, int j, int cost) {
		a[i][j] = cost;
	}

	public int getCost(int s, int e) {
		Arrays.fill(b, false);
		q.clear();
		b[s] = true;
		for (int i = 1; i < a.length; ++i)
			if (a[s][i] > 0)
				q.add(new int[] { i, a[s][i] });
		int c = 0;
		while (!q.isEmpty()) {
			int[] t = q.poll();
			if (t[0] == e) {
				c = t[1];
				break;
			}
			b[t[0]] = true;
			for (int i = 1; i < a.length; ++i)
				if (!b[i] && a[t[0]][i] > 0)
					q.add(new int[] { i, t[1] + a[t[0]][i] });
		}
		return c;
	}

}