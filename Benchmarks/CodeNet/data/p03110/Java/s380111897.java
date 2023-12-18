import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double x;
		String u;
		double sum = 0;
		double bit = 380000;
		for(int i = 0; i < n; ++i) {
			x = sc.nextDouble();
			u = sc.next();
			if(u.equals("BTC")) {
				double tmp = x * bit;
				sum += tmp;
			}
			else sum += (double)x;
		}
		sc.close();
		System.out.println(sum);
	}

}
