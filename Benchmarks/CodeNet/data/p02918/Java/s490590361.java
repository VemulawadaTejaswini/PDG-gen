import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		String S = sc.next();
		int ans = 0;
		String str[] = {"L", "R"};
		for(int a = 0; a < 2; a++) {
			Queue<Integer> q = new ArrayDeque<Integer>();
			String pre_s = S.substring(0, 1);
			int temp = 0;
			int cnt = 1;
			for(int i = 1; i < S.length(); i++) {
				String now_s = S.substring(i, i + 1);
				if(!now_s.equals(pre_s) && now_s.equals(str[a])) {
					q.add(cnt);
					temp += cnt;
					if(q.size() > K) {
						temp -= q.poll();
					}
					cnt = 1;
					ans = Math.max(ans, temp);
				} else {
					cnt++;
				}
				pre_s = now_s;
			}
			temp += cnt;
			if(S.substring(S.length() - 1, S.length()).equals(str[a])) q.add(cnt);
			if(q.size() > K) temp -= q.poll();
			ans = Math.max(ans, temp);
		}
		System.out.println(ans - 2);
	}
}