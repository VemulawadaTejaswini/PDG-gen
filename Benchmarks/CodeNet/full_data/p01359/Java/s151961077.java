import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int n, q;
		while (true) {
			n = sc.nextInt(); q = sc.nextInt();
			if (n == 0 && q == 0) break;
			String[] era = new String[n];
			int[] erabase = new int[n];
			int[] westy = new int[n];
			for (int i = 0; i < n; i++) {
				era[i] = sc.next();
				erabase[i] = sc.nextInt();
				westy[i] = sc.nextInt();
			}
			I:for (int i = 0; i < q; i++) {
				int query = sc.nextInt();
				for (int j = 0; j < n; j++) {
					if (westy[j]-erabase[j] < query && query <= westy[j]) {
						out.printf("%s %d\n", era[j], query-westy[j]+erabase[j]);
						continue I;
					}
				}
				out.println("Unknown");
			}
			
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}