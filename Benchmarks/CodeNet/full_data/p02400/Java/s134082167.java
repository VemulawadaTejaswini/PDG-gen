import java.util.Scanner;

class Main {
	Scanner sc = new Scanner(System.in);
	public void run() {
		double r=sc.nextDouble();
		ln(String.format("%.8f %8f",Math.PI*r*r, Math.PI*2*r));
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}
	public static void ln() {
		System.out.println();
	}
}