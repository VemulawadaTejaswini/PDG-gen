import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int n, r;
		int p, c;
		int[] deck;
		int[] ptemp, ctemp;
		while (true) {
			n = sc.nextInt();
			r = sc.nextInt();
			if (n == 0 && r == 0) break;
			deck = new int[n];
			ptemp = new int[n];
			ctemp = new int[n];
			for (int i = 0; i < n; i++)
				deck[i] = n-i;
			for (int i = 0; i < r; i++) {
				p = sc.nextInt();
				c = sc.nextInt();
				for (int j = 0; j < p-1; j++)
					ptemp[j] = deck[j];
				for (int j = 0; j < c; j++)
					ctemp[j] = deck[p-1+j];
				
				for (int j = 0; j < c; j++)
					deck[j] = ctemp[j];
				for (int j = 0; j < p-1; j++)
					deck[c+j] = ptemp[j];
			}
			out.println(deck[0]);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}