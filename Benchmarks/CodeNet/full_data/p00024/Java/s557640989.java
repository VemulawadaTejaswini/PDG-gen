import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while (sc.hasNext()) {
			double v=sc.nextDouble();
			double y=4.9*(v/9.8)*(v/9.8);
			ln(1+(int)Math.ceil(y/5));
		}
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