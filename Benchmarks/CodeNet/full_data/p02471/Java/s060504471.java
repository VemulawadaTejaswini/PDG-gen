import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();

		extgcd(a, b);
		System.out.println(x+" "+y);
	}
	
	static long x;
	static long y;
	static long extgcd (long a, long b) {
		long d = a;
		if (b != 0) {
			swap_xy();
			d = extgcd(b, a%b);
			swap_xy();
			y -= (a/b)*x;
		} else {
			x = 1; y = 0;
		}
		return d;
	}
	static void swap_xy() {
		long tmp=x;x=y;y=tmp;
	}

}