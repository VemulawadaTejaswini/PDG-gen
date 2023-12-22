import java.util.Scanner;


class main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		double pai = 3.141592653589;
		
		double men1 = (double) (r * r * pai);
		double syu1 = (double) (2 * r * pai);
		
		String syu2 = String.format("%.8", syu1);
		String men2 = String.format("%.8", men1);
		System.out.println(men2 + " " + syu2);
	}
}