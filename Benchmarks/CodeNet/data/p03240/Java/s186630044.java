import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long x[] = new long[N];
		long y[] = new long[N];
		long h[] = new long[N];
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextLong();
			y[i] = sc.nextLong();
			h[i] = sc.nextLong();
		}
		
		long ans_x = 0;
		long ans_y = 0;
		long ans_h = 0;
		
		out : for(long c_x = 0; c_x <= 100; c_x++) {
			in : for(long c_y = 0; c_y <= 100; c_y++) {
				for(int i = 0; i < N; i++) {
					if(ans_h == 0) {
						if(h[i] != 0) {
							ans_h = h[i] + Math.abs(c_x - x[i]) + Math.abs(c_y - y[i]);
						}
					} else {
						if(ans_h != h[i] + Math.abs(c_x - x[i]) + Math.abs(c_y - y[i]) && h[i] != 0) {
							ans_h = 0;
							continue in;
						}
					}
				}
				ans_x = c_x;
				ans_y = c_y;
				break out;
			}
		}
		
		System.out.println(ans_x + " " + ans_y + " " + ans_h);
	}
}
