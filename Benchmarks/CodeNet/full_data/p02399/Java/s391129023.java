import java.util.Scanner;

class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int d = a / b;
		int r = a % b;
		float f = (float)a / b;
		String after = String.format("%.5f", f);
		System.out.println(d + " " + r + " " + after);
	}
}