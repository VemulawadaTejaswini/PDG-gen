
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		String t = sc.next();
		int n = sc.nextInt();
		int cnt = 0;
		for(int i=0;i<n;i++) {
			String s = sc.next();
			for(int j=0;j<10;j++) {
				boolean flg = true;
				for(int k=0;k<t.length();k++) {
					if( t.charAt(k) != s.charAt((j+k)%10) )
						flg = false;
				}
				if( flg ) {
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}