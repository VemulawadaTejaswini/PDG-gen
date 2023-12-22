import java.util.*;

class Pair {
	public Pair(int f, int s) {
		this.f = f;
		this.s = s;
	}
	public int f, s;
}

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int w = scanner.nextInt();
		int n = scanner.nextInt();
		Pair[] pairs = new Pair[n];
		for (int i = 0; i < n; i++) {
			String[] s = scanner.next().split(",");
			pairs[i] = new Pair(Integer.parseInt(s[0]) - 1, Integer.parseInt(s[1]) - 1);
		}
		int[] result = new int[w];
		for (int i = 0; i < w; i++) {
			int finger = i;
			for (int j = 0; j < n; j++) {
				if (finger == pairs[j].f) finger = pairs[j].s;
				else if (finger == pairs[j].s) finger = pairs[j].f;
			}
			result[finger] = i + 1;
		}
		for (int i = 0; i < w; i++) System.out.println(result[i]);
	}
}