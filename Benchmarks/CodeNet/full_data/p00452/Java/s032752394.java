import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(true) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			if(N == 0 && M == 0) break;
			int []P = new int[N + 1];
			int max = 0;
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 1; i <= N; i++) {
				P[i] = sc.nextInt();
			}
			Arrays.sort(P);
			for(int i = 0; i <= N; i++) {
				for(int j = 0; j <= N; j++) {
					int t = P[i] + P[j];
					if(t <= M) {
						list.add(t);
					}else {
						break;
					}
				}
			}
			Collections.sort(list);
			int l = list.size();
			for(int i = 0; i < l; i++) {
				int res = M - list.get(i);
				int left = -1;
				int right = l;
				while(right - left > 1) {
					int mid = (right + left) / 2;
					if(res >= list.get(mid)) {
						left = mid;
					}else {
						right = mid;
					}
				}
				max = Math.max(max, list.get(i) + list.get(left));
			}
			sb.append(max).append("\n");
		}
		sc.close();
		System.out.print(sb.toString());
	}
}
