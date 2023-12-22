
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if( n == 0 ) break;
			
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) sb.append(sc.nextInt());
			
			debug(sb);
			int min = n;
			for(int i=0;i<sb.length();i++) for(int c=1;c<=3;c++){
				StringBuilder tmp = new StringBuilder(sb.substring(0, i) + c + sb.substring(i+1));
				debug(tmp);
				int l = i, r = i, cnt = 0;
				while(l>=0) {
					int cc = tmp.charAt(l) - '0';
					while( l > 0 && cc == ( tmp.charAt(l-1) - '0') ) l--;
					while( r < sb.length()-1 && cc == ( tmp.charAt(r+1) - '0' )) r++;
					debug(l, r, r-l-cnt+1);
					if( r-l-cnt+1 < 4 ) break;
					cnt += r-l-cnt+1;
					l--;
				}
				
				min = min(sb.length() - cnt, min);
			}
			
			System.out.println(min);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
//		System.err.println(Arrays.deepToString(os));
	}
}