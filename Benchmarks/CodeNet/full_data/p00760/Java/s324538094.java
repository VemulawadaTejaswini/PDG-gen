
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class P1179 {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int c=0;c<n;c++) {
			int y = sc.nextInt(), m = sc.nextInt(), d = sc.nextInt(), cnt = 0;
			while( !( y == 1000 && m == 1 && d == 1 ) ) {
				cnt++; d++;
				if( d == (y%3==0? 21: ( m%2==0? 20: 21 ) ) ) {
					d = 1; m++;
					if(m == 11) {
						m = 1; y++;
					}
				}
			}
			System.out.println(cnt);
			
		}
	}

	public static void main(String[] args) {
		new P1179().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}