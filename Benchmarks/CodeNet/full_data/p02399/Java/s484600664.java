import java.util.Scanner;

class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float a = scan.nextInt();
		float b = scan.nextInt();
		
		int d = (int)(a / b);
		int r = (int)(a % b);
		float f = (float)(a / b);
		String after = String.format("%.5f", f);
		System.out.println(d + " " + r + " " + after);
	}
}