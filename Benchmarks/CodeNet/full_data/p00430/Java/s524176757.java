
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n=sc.nextInt();
			if( n == 0 ) break;
			int num[] = new int[n+2];
			num[1] = num[0] = n;
			dfs(1, num);
		}
	}
	
	void dfs(int i, int[] num) {
		if(num[i] <= num[i-1]) {
			System.out.print(num[1]);
			for(int j=2;num[j] != 0;j++) System.out.print( " " + num[j] );
			System.out.println();
		}
		if(num[i] == 1) return;
		num[i]--; num[i+1]++;
		for(;num[i]>=1;num[i]--, num[i+1]++) {
			dfs(i+1, num);
		}
		num[i]++; num[i+1]--;
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}