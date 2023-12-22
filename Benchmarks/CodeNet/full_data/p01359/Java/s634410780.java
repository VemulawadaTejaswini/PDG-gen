import java.util.*;
import java.lang.*;
import java.math.*;
public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int n = sc.nextInt();
			int q = sc.nextInt();

			if ((n | q) == 0) {
				break;
			}

			String era[] = new String[n];
			int eb[] = new int[n];
			int w[] = new int[n];

			for (int i = 0; i < n; i++) {
				era[i] = sc.next();

				eb[i] = sc.nextInt();
				w[i] = sc.nextInt();
			}
			
			for(int i = 0; i< q;i++){
				int query = sc.nextInt();
				
				int m = -1;
				for(int j = 0; j < n ; j++){
					if(w[j]>=query && query>w[j] - eb[j]){
						m = j;
						break;
					}
				}
				if(m == -1){
					System.out.println("Unknown");
				}
				else{
					System.out.println(era[m] + " "+-(w[m]-eb[m]-query));
				}
			}

		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}