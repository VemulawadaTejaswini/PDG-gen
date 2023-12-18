import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int N = Integer.parseInt(in.next());
		final int K = Integer.parseInt(in.next());
		final int C = Integer.parseInt(in.next());
		final String S = in.next();
		int[] right_count = new int[N];
		int cnt = N - 1;
		int right_range = 0;
		while(cnt >= 0) {
			if(S.charAt(cnt) == 'o') {
				right_range += 1;
				right_count[cnt] = right_range;
				for(int i = 0; i < C; i++) {
					cnt -= 1;
					cnt = Math.max(0, cnt);
					right_count[cnt] = right_range;
				}
			}else{
				right_count[cnt] = right_range;
			}
			cnt -= 1;
		}
		int range_seen = 0;
		List<Integer> ans = new ArrayList<Integer>();
		if(right_range == K) {
			cnt = 0;
			while(cnt < N) {
				if(S.charAt(cnt) == 'o') {
					range_seen += 1;
					ans.add(cnt + 1);
					boolean flag = false;
					for(int i = 0; i < C; i++) {
						cnt += 1;
						if(cnt < N) {
							if((S.charAt(cnt) == 'o') && (cnt + C + 1 < N)) {
								if(right_count[cnt + C + 1] == K - range_seen) flag = true;
							}else if((S.charAt(cnt) == 'o') && (range_seen == K)) flag = true;
						}
					}
					if(flag == true) {
						ans.remove(ans.size() - 1);
					}
				}
				cnt += 1;
			}
		}
		for(int i = 0; i < ans.size(); i++) 
			System.out.println(ans.get(i));
	}
}