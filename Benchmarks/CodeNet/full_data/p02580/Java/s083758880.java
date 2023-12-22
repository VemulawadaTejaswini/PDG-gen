import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		execute20_3();
	}

	private static void execute20_3() {
		try (Scanner sc = new Scanner(System.in)) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int m = sc.nextInt();
			
			int[] hnum= new int[h];
			int[] wnum= new int[w];
			int[][] put = new int[h][w];
			for (int i = 0; i < m; i++) {
				int hb = sc.nextInt()-1;
				int wb = sc.nextInt()-1;
				hnum[hb]++;
				wnum[wb]++;
				put[hb][wb]=1;
			}
			int ans=0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					ans = Math.max(ans, hnum[i]+wnum[j]-put[i][j]);
				}
			}
			System.out.println(ans);
		}
	}
}