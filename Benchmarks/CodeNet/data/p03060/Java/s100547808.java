import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		int n = sc.nextInt();
		int sum = 0;
		int[] v = new int[n];
		int[] c = new int[n];
		for(int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			if(v[i] > c[i]) {
				sum += v[i] - c[i];
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
