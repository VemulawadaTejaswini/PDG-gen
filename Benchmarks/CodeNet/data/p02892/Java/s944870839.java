import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[][] way = new int[N][N];
		scn.nextLine();
		for (int j = 0; j < N; j++) {
			char[] ss = scn.nextLine().toCharArray();
			for(int i = 0;i < N;i++) {
				way[j][i] = (ss[i] == 48)?0:1;
			}
		}

		int ans = -1;

		for (int n = 0; n < N; n++) {

			int[] group = new int[N];
			boolean can = true;
			HashSet<Integer> the = new HashSet<Integer>();
			HashSet<Integer> next = new HashSet<Integer>();

			int now_g = 0;
			next.add(n);
			while (!next.isEmpty()) {
				the = new HashSet<Integer>();
				now_g++;
				for(int j:next) {
					the.add(j);
					group[j] = now_g;
				}
				next = new HashSet<Integer>();
				for (int j : the) {
					for (int i = 0; i < N; i++) {
						if (way[j][i] != 1)
							continue;
						if(group[i] != 0) {
							if(group[i] == now_g-1) {

								continue;
							}else {
								can = false;
								break;
							}
						}
						next.add(i);
					}
					if(!can)break;
				}
			}

			if(can)ans = Math.max(now_g, ans);
		}
		System.out.println((ans < 2)?-1:ans);

	}

}
