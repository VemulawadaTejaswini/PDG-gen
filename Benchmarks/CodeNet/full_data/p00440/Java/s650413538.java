
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			if( (n|k) == 0 ) break;
			int[] card = new int[k+1];
			for(int i=0;i<k;i++) card[i] = sc.nextInt();
			sort(card);
			int max = 0;
			if( card[1] != 0 ) {
				int cnt = 0;
				for(int i=1;i<=k;i++) {
					if( card[i] == card[i-1] + 1 )
						cnt++;
					else cnt = 1;
					max = max(cnt, max);
				}
			}
			else {
				int[] cnt = new int[2];
				for(int i=2;i<=k;i++) {
					if( card[i] == card[i-1] + 1 ) {
						cnt[0]++;
						if(cnt[1] != 0) cnt[1]++;
					}
					else if( card[i] == card[i-1] + 2) {
						cnt[1] = cnt[0] + 2;
						cnt[0] = 1;
					}
					else {
						cnt[0] = 1;
						cnt[1] = 0;
					}
					max = max(max, max(cnt[0], cnt[1]));
				}
			}
			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}