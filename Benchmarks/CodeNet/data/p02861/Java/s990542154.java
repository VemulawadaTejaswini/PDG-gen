import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int LEN = 0;
	
	void doIt() {
		 int n = sc.nextInt();
		 int x[] = new int[n];
		 int y[] = new int[n];
		 for(int i = 0; i < n; i++) {
			 x[i] = sc.nextInt();
			 y[i] = sc.nextInt();
		 }
		 double sum = 0;
		 for(int i = 0; i < n; i++) {
			 for(int j = 0; j < n; j++) {
				 sum += dis(x[i], x[j], y[i], y[j]);
			 }
		 }
		 System.out.println(sum / n);
		 
	}
	
	double dis(int x1, int x2, int y1, int y2) {
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}
	
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
