import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] h = new int[n];
		int H = 0;
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}
		LOOP:for(int i = 0; i <= 100; i++) {
			for(int j = 0; j <= 100; j++) {
				for(int k = 0; k < n; k++) {
					if(h[k] != 0) {
						H = h[0] + Math.abs(x[0]-i) + Math.abs(y[0]-j);
						break;
					}
				}
				for(int k = 0; k < n; k++) {
					if(h[k] != 0) {
						if(h[k] + Math.abs(x[k]-i) + Math.abs(y[k]-j) != H)
							break;
					}
					if(k == n-1) {
						System.out.println(i + " " + j + " " + H);
						break LOOP;
					}
				}
			}
		}
	}

}