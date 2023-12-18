import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		double sum = 0;
		for(int i = 1; i <= n ; i++) {
			
			double x = 1.0/n;
			int ii = i ;
			
			while( ii < k) {
				ii *=2;
				x /= 2;
			}
			
			sum += x;
		}
		
		System.out.println(sum);
	}
}
