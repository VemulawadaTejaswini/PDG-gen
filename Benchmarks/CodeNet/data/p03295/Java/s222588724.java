import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] deepMap = new int[N];
		int[][] map = new int[M][2];
		for (int i = 0; i < M; i++) {
			int[] tmp = new int[2];
			tmp[0] = sc.nextInt();
			tmp[1] = sc.nextInt();
			map[i] = tmp;
			for (int j = tmp[0]; j < tmp[1]; j++) {
				deepMap[j - 1]++;
			}
		}
		
		boolean[] hashi = new boolean[N-1];
		for (int i = 0; i < M; i++) {
			int[] tmp = map[i];
			int maxIndex = -1;
			int max = 0;
			for (int j = tmp[0]; j < tmp[1]; j++) {
				if (hashi[j-1]) {
					maxIndex = -1;
					break;
				}
				
				int tmpMax = max;
				max = Math.max(max, deepMap[j - 1]);
				if (tmpMax != max) {
					maxIndex = j - 1;
				}
			}
			
			if (maxIndex > -1)
				hashi[maxIndex] = true;
			
		}
		
		int ans = 0;
		for (boolean b : hashi) {
			ans += b ? 1 : 0;
		}
		
		System.out.println(ans);
	}
	
}