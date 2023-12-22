import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	int[] par = new int[100001];
	
	int find(int i) {
		if (i == par[i])return i;
		return find(par[i]);
	}
	
	void mark(int i) {
		par[i] = i;
	}
	
	void run() {
		while (true) {
			int n = sc.nextInt(), q = sc.nextInt();
			if (n == 0) break;
			par[1] = 1;
			for (int i = 1; i < n; i++)
				par[i+1] = sc.nextInt();
			
			int res = 0;
			for (int i = 0; i < q; i++) {
				if (sc.next().equals("Q")) {
					res += find(sc.nextInt());
				} else {
					mark(sc.nextInt());
				}
			}
			out.print(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}