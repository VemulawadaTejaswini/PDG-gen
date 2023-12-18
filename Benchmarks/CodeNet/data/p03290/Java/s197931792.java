import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int d = sc.nextInt();
		int g = sc.nextInt();

		int[] p = new int[d];
		int[] c = new int[d];

		for(int i = 0; i < d; i++) {
			p[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}

		int ans = Integer.MAX_VALUE;
		
		for(int i = d - 1; i >= 0; i--) {
			int a = 0;
			int sum = 0;
			int in = i;
			while(sum < g && in >= 0) {
				if(p[in] > 0) {
					sum += (in + 1) * 100;
					p[in]--;
					a++;
				} else {
					sum += c[in];
					in--;
				}
			}
			if(sum >= g) ans = Math.min(ans, a);
		}
		
		System.out.println(ans);
    }
}
