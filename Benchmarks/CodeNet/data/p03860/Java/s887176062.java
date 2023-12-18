import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.next();
		String b = sc.next();
		sc.next();
		sc.close();

		System.out.println("A" + b.charAt(0) + "C");
	}
}