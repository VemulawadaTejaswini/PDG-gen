
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
			
			int[] br = new int[k];
			boolean flg = true;
			for(int i=0;i<k;i++) br[i] = sc.nextInt();
			for(int i=0;i<n;i++) for(int j=0;j<k;j++) {
				br[j] -= sc.nextInt();
				if( br[j] < 0 ) flg = false;
			}
			
			System.out.println((flg? "Yes": "No"));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}