import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long w = sc.nextLong();
		long h = sc.nextLong();
		long x = sc.nextLong();
		long y = sc.nextLong();
		
		double area = w * h / 2.0;
		int mlt = x * 2 == w && y * 2 == h ? 1 : 0;
		System.out.printf("%f %d\n", area, mlt);
		
		sc.close();
	}
}


