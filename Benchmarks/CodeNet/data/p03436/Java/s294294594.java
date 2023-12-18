
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static String[] s;
	public static int[][] dis;
	public static Set<Pair> set = new HashSet<>();
	public static int h;
	public static int w;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		s = new String[h];
		for(int i = 0; i < h; i++) {
			s[i] = sc.next();
		}
		dis = new int[h][w];
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				dis[i][j] = Integer.MAX_VALUE;
			}
		}
		dis[0][0] = 1;
		if(dis[h - 1][w - 1] == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			int cnt = 0;
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(s[i].charAt(j) == '#')
						cnt++;
				}
			}
			int ans = h * w - cnt - dis[h - 1][w - 1];
			System.out.println(ans);
		}
	}

	public static void djk(int i, int j) {
		int tmp = dis[i][j];
		if(i > 0 && dis[i - 1][j] > tmp + 1 && s[i].charAt(j) == '.') {
			set.add(new Pair(i - 1, j));
			dis[i - 1][j] = tmp + 1;
		}
		if(i < h - 1 && dis[i + 1][j] > tmp + 1 && s[i + 1].charAt(j) == '.') {
			set.add(new Pair(i + 1, j));
			dis[i + 1][j] = tmp + 1;
		}
		if(j > 0 && dis[i][j - 1] > tmp + 1 && s[i].charAt(j - 1) == '.') {
			set.add(new Pair(i, j - 1));
			dis[i][j - 1] = tmp + 1;
		}
		if(j < w - 1 && dis[i][j + 1] > tmp + 1 && s[i].charAt(j + 1) == '.') {
			set.add(new Pair(i, j + 1));
			dis[i][j + 1] = tmp + 1;
		}
		for(Pair e : set) {
			djk(e.getI(), e.getJ());
		}
	}

}

class Pair {
	private int i;
	private int j;

	protected Pair(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

}
