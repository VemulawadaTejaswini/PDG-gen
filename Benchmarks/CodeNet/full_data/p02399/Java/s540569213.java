import java.util.Scanner;

class Main {
	Scanner sc = new Scanner(System.in);
	//10^9<INT_MAX(2,147,483,647)<10^10
	public void run() {
		long a=sc.nextLong(),b= sc.nextLong();
		ln(a/b+" "+ a%b+" " + (double)a/b);
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