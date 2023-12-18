import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static int INF = 1 << 29;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int[] count = new int[128];
		int n = s.length;
		for(int i=0;i<n;i++) {
			count[s[i]]++;
		}
		int odd = 0;
		for(int i=0;i<128;i++) {
			odd += count[i] & 1;
		}
		if (odd <= 1) {
			System.out.println(1);
			return;
		}
		//嘘
		int[] dist = new int[n];
		boolean[] usedc = new boolean[128];
		Arrays.fill(dist, INF);
		dist[0] = 0;
		Queue<Integer> q = new ArrayDeque<>();
		q.offer(0);
		int ans = -1;
		LOOP: while(!q.isEmpty()) {
			odd = 0;
			int l = q.poll();
			Arrays.fill(count, 0);
			Arrays.fill(usedc, false);
			for(int r=l;r<n;r++) {
				count[s[r]]++;
			}
			for(int i=0;i<128;i++) {
				odd += count[i] & 1;
			}
			for(int r=n-1;r>=l;r--) {
				if (odd == 1) {
//					System.err.println("[" + l + "," + r + "]");
					if (r == n - 1) {
						ans = dist[l] + 1;
						break LOOP;
					}
					if (!usedc[s[r]] && dist[r+1] > dist[l] + 1) {
						dist[r+1] = dist[l] + 1;
						usedc[s[r]] = true;
						q.offer(r+1);
					}
				}
				if ((count[s[r]] & 1) == 1) {
					odd--;
				}else{
					odd++;
				}
				count[s[r]]--;
			}
		}
		System.out.println(ans);
	}
}
