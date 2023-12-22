
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if( (n|m) == 0) break;
			int p[] = new int[n+1];
			p[0] = 0;
			for(int i=1;i<=n;i++) p[i] = sc.nextInt();
			int num[] = new int[(n+1)*(n+1)];
			
			int size = 0;
			for(int i=0;i<=n;i++) for(int j=0;j<=n;j++) {
				if( p[i] + p[j] <= m )
					num[ size++ ] = p[i]+p[j];
			}
			sort(num);
//			debug(num);
			int max = 0;
			for(int i=0;i<(n+1) * (n+1);i++) {
				int lim = m - num[i];
				int left = 0;
				int right = size;
				while(left < right) {
					int c = ( left + right ) / 2;
					if( lim > num[c] ) {
						left = c+1;
					}
					else if( lim < num[c] ) {
						right = c;
					}
					else {
						break;
					}
				}
//				debug(num[i], right-1, num[right-1]);
				max = max(max, num[i] + num[right-1]);
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