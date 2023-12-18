import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		char[] s = sc.next().toCharArray();
		StringBuilder ans = new StringBuilder();
		int[] d = new int[N+1];
		Arrays.fill(d, -1);
		d[N] = 0;
		Queue<Integer> q = new ArrayDeque<>();
		q.add(N);
		while(q.size() > 0) {
			boolean first = true;
			int x = q.poll();
			for(int i = M; i >= 1; i--) {
				if(x-i <= 0) {
					d[0] = d[x] + 1;
					break;
				}
				if(d[x-i] == -1 && s[x-i] == '0') {
					d[x-i] = d[x] + 1;
					if(first) {
						q.add(x-i);
						first= false;
					}
				}
			}
		}
		if(d[0] == -1) {
			System.out.println(-1);
			return;
		}
		int now = 0, prev = d[0];
		while(true) {
			for(int i = 1; i <= M; i++) {
				if(now+i == N) {
					System.out.println(ans.append(i));
					return;
				}
				if(d[now+i] != -1 && d[now+i] != prev) {
					ans.append(i + " ");
					prev = d[now+i];
					now += i;
					break;
				}
			}
		}
	}

}