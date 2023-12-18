import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		int[][] map = new int[Q][2];
		for (int i = 0; i < Q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			map[i][0] = l-1;
			map[i][1] = r-1;
		}

		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < S.length() - 1; i++) {
			if (S.charAt(i) == 'A' && S.charAt(i+1) == 'C') {
				set.add(i);
			}
		}

		for (int i = 0; i < map.length; i++) {
			int a = map[i][0];
			int b = map[i][1];
			int ap = 0;
			for (int j = a; j < b; j++) {
				if (set.contains(j)) ap++;
			}
			System.out.println(ap);
		}
	}
}