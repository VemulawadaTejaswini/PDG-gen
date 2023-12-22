import java.util.Scanner;
public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	static double k() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		double sum = 0;
		double sumr = 0;
		
		for(int i=0; i<m; i++) {
			int v = sc.nextInt();
			double r = sc.nextDouble();
			sum += v * r;
			sumr += r;
		}
		return sum / sumr;
	}
	
	public static void main(String[] args) {
		int t = sc.nextInt();
		double max = 0;
		for(int i=0; i<t; i++) {
			max = Math.max(max, k());
		}
		if(max - k() > 0.0000001) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
