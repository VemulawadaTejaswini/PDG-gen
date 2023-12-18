
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		int ans = n;
		if(n == 1 || n == 2) {
			ans = 1;
		}else {
			for(int i = 0; i < n-1; i++) {
					int cnt = 0;
					for(int k = 0; k < n; k++) {
						for(int m = k+1; m < n; m++) {
							int x1 = x[i+1] - x[i];
							int y1 = y[i+1] - y[i];
							int x2 = x[m] - x[k];
							int y2 = y[m] - y[k];
							int gai = y2*x1 - y1*x2;
							if(gai == 0 ) {
								if(i+1 != m && i != k) {
									ans --;
									cnt ++;
								}
								
							}
						}
						
					}
					if(cnt > 1) {
						ans += cnt-1;
					}
			}
		}
		System.out.println(ans);
		sc.close();
	}


}
