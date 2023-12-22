
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		int[] a = {1,0,0};
		while(sc.hasNext()) {
			String[] s = sc.next().split(",");
			swap( a, (int)(s[0].charAt(0) - 'A'), (int)(s[1].charAt(0) - 'A'));
//			debug(a);
		}
		int ans = 0;
		for(int i=0;i<3;i++) if(a[i] == 1) ans = i;
		System.out.println((char) ('A' + ans));
	}
	
	void swap(int[] s, int a, int b) {
		int tmp = s[a];
		s[a] = s[b];
		s[b] = tmp;
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}