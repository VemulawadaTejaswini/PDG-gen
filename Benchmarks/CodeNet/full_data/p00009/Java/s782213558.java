
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	boolean[] prime;
	int MAX = 1000000;
	void run() {
		Scanner sc = new Scanner(System.in);
		boolean prime[] = new boolean[MAX];
		for(int i=2;i<MAX;i++) {
			if( !prime[i] ) {
				for(int j=i*2;j<MAX;j+=i) prime[j] = true;
			}
		}
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int cnt = 0;
			for(int i=2;i<=n;i++) 
				if(!prime[i])cnt++;
			System.out.println(cnt);
		}
		
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}