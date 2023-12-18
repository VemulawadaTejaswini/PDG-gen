import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		double area = w * h / 2.0;
		int mlt = x * 2 == w && y * 2 == h ? 1 : 0;
		System.out.printf("%f %d\n", area, mlt);
		
		sc.close();
	}
}


