
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		/*
		 * int b[] = new int[n]; int w[] = new int[n];
		 * 
		 * for(int i =0 ; i < n ; i++){ String c = sc.next(); int a =
		 * sc.nextInt()-1; if(c.startsWith("B")){ b[a] = i; }else{ w[a] = i; } }
		 */
		int[] b = new int[2 * n];
		int[] w = new int[2 * n];

		for (int i = 0; i < n*2; i++) {
			String c = sc.next();
			int a = sc.nextInt() ;
			if (c.startsWith("B")) {
				b[i] = a;
				w[i] = -1;
			} else {
				w[i] = a;
				b[i] = -1;
			}
		}

		
		int af = 0;
		int bf = 0;
		int ans = 0;
		boolean used[] = new boolean[2*n];
		for (int i = 0; i < 2 * n; i++) {
			
//			System.out.println("searching " +i+"th element -------------------------" +af+" "+bf);
			for(int j = 0 ; j < 2*n;j++){
//				System.out.println("    checking: "+j + " "+b[j]+" "+w[j]);
				if(used[j]){
					continue;
				}
				if(af+1 == b[j]){
//					System.out.println("isBlackMinimum");
					used[j] = true;
					af++;
					break;
				}
				if(bf+1 == w[j]){
//					System.out.println("isWhiteMinimum");
					used[j] = true;
					bf++;
					break;
				}
				
				ans ++;
				
			}
		}
		System.out.println(ans);

	}
}
