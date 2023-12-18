import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean[] c = new boolean[8];
		int fc = 0;
		
		for (int i = 0; i < N; i++) {
			int n = sc.nextInt();
			if (n < 400) {
				c[0] = true;
			} else if (n < 800) {
				c[1] = true;
			} else if (n < 1200) {
				c[2] = true;
			} else if (n < 1600) {
				c[3] = true;
			} else if (n < 2000) {
				c[4] = true;
			} else if (n < 2400) {
				c[5] = true;
			} else if (n < 2800) {
				c[6] = true;
			} else if (n < 3200) {
				c[7] = true;
			} else {
				fc++;
			}
		}
		
		int min = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i]) {
				min++;
			}
		}
		
		System.out.println(Math.max(1, min) + " " + (min + fc));
	}
}
