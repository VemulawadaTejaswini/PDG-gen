import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n];
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i = 0 ; i < n ; i++) {
			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		int dist = x[0] + y[0];
		int time = t[0];
		boolean ok = true;
		for(int i = 0 ; i < n ; i++) {
			if(i != 0) {
				dist = Math.abs(x[i] - x[i - 1]) + Math.abs(y[i] - y[i - 1]);
				time = Math.abs(t[i] - t[i - 1]);
			}
			if(time < dist) {
				ok = false;
			} else if(time > dist && time % 2 != dist % 2) {
				ok = false;
			}
		}
		if(ok) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
