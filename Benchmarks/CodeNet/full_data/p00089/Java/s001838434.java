
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int[] now, next;
	int[] dp1, dp2;
	void run() {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.next().split(",");
		now = new int[str.length+4];
		now[2] = Integer.parseInt(str[0]);
		dp1 = new int[51];
		dp2 = new int[51];
		dp1[1] = now[2]; 
		for(;sc.hasNext();) {
	//		debug(dp1);
			str = sc.next().split(",");
			dp2 = dp1.clone();
	//		if(str[0].equals("0")) break;
			next = new int[str.length+4];
			for(int i=0;i<str.length;i++) next[i+2] = Integer.parseInt(str[i]);
	//		debug(next);
			for(int i=2;i<=str.length+1;i++) {
				if(now.length < next.length) dp1[i-1] = max( dp2[i-2] + next[i], dp2[i-1] + next[i]);
				else dp1[i-1] = max( dp2[i-1] + next[i], dp2[i] + next[i]);
			}
			now = next.clone();
		}
		System.out.println(dp1[1]);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}