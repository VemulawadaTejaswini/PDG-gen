import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int n, k, m;
		while (true) {
			n = sc.nextInt(); k = sc.nextInt(); m = sc.nextInt();
			if (n == 0) break;
			boolean[] check = new boolean[n];
			check[m-1] = true;
			int count = 1, index = m-1;
			while (count < n-1) {
				int c = 0;
				while (c != k) {
					index = (index+1)%n;
					if (!check[index]) c++; 
				}
				check[index] = true;
				count++;
			}
			for (int i = 0; i < n; i++) {
				if (!check[i]) {
					out.println(i+1);
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}