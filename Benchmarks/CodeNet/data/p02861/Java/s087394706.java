import java.util.Scanner;
public class Main {

	
	static int multiply(int n) {
		if(n==1) {
			return 1;
		}else {
			return n * multiply(n-1);
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int[] x = new int[n];
		int[] y = new int[n];
		
		for(int i = 0; i < n; i++) {
			x[i] = stdIn.nextInt();
			y[i] = stdIn.nextInt();
		}
		
		double sum = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i==j) {
					continue;
				}else {
					int dist = (x[i]-x[j])*(x[i]-x[j]) + (y[i]-y[j])*(y[i]-y[j]);
					sum += Math.sqrt(dist);
				}
			}
		}
		
		double ans = sum / n;
		
		System.out.println(ans);
		
	}

}
