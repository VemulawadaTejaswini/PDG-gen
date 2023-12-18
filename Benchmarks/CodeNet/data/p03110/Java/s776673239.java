import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		double x;
		String u;
		double sum = 0;
		
		for(int i = 0; i < N; i++) {
			x = sc.nextDouble();
			u = sc.next();
			if(u.equals("JPY")) {
				sum += x;
			} else {
				sum += x * 380000.0;
			}
		}
		
		System.out.println(sum);
		
	}
}
