
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
		int ans = n-1;
		int st = 0;
		if(n == 1 || n == 2) {
			ans = 1;
		}else {
			for(int i = 0; i < n; i++) {
				for(int j = i+1; j < n; j++) {
					int tmp = 0;
					for(int k = 0; k < n; k++) {
						for(int m = k+1; m < n; m++) {
							int x1 = x[j] - x[i];
							int y1 = y[j] - y[i];
							int x2 = x[m] - x[k];
							int y2 = y[m] - y[k];
							if(x1 == x2 && y1 == y2) {
								if(j != m || k != i) {
									tmp ++;
								}
							}
							
						}
					}
					st = Math.max(st, tmp);
				}
			}
		}
		System.out.println(ans-st);
		sc.close();
	}


}
