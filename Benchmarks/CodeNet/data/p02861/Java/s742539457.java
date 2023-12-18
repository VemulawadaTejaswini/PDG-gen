import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static Queue<int[]> que = new ArrayDeque<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Point[] city = new Point[n];
		Arrays.setAll(city, i -> new Point(sc.nextInt(), sc.nextInt()));
		
		permutation(n);
		
		int cnt = 0;
		double sum = 0;
		while (!que.isEmpty()) {
			cnt++;
			int[] idx = que.poll();
			double dis = 0;
			
			for (int i = 0; i < n - 1; i++) {
				dis += city[idx[i]].distance(city[idx[i + 1]]);
			}
			
			sum += dis;
		}
		
		double ans = sum / cnt;
		System.out.println(ans);
		
		sc.close();
	}
	
	static void permutation(int n) {
		int[] perm = new int[n];
		boolean[] used = new boolean[n];
		buildPerm(getSeed(n), perm, used, 0);
	}
	
	static int[] getSeed(int n) {
		int[] reArr = new int[n];
		for (int i = 0; i < n; i++) reArr[i] = i;
		return reArr;
	}
	
	static void buildPerm(int[] seed, int[] perm, boolean[] used, int idx) {
		if (idx == seed.length) {
			que.add(Arrays.copyOf(perm, seed.length));
			return;
		}
		
		for (int i = 0; i < seed.length; i++) {
			if (used[i]) continue;
			perm[idx] = seed[i];
			used[i] = true;
			buildPerm(seed, perm, used, idx + 1);
			used[i] = false;
		}
	}
	
}

