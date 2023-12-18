import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t[] = new int [10001];
		int x[] = new int [10001];
		int y[] = new int [10001];
		t[0] = 0;
		x[0] = 0;
		y[0] = 0;
		for(int i = 1; i <= n; i++) {
			 t[i] = sc.nextInt();
			 x[i] = sc.nextInt();
			 y[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
				if(t[i + 1] - t[i] < Math.abs(x[i + 1] - x[i]) + Math.abs(y[i + 1] - y[i])
				   ||((t[i + 1] - t[i]) % 2 == 1 && (Math.abs(x[i + 1] - x[i]) + Math.abs(y[i + 1] - y[i])) % 2 == 0)
			       ||((t[i + 1] - t[i]) % 2 == 0 && (Math.abs(x[i + 1] - x[i]) + Math.abs(y[i + 1] - y[i])) % 2 == 1)) {
					System.out.println("No");
		            return;
				}
		}
		System.out.println("Yes");
	}
}