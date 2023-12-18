import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int n = sc.nextInt();
		int k = sc.nextInt() - 1;
		int[] h = new int[n];
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		Arrays.sort(h);
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n - k; i++) {
			int d = h[i + k] - h[i];
			if(min > d) min = d;
		}
		System.out.println(min);
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}
