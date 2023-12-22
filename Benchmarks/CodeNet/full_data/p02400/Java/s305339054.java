import java.util.Scanner;


class main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		double pai = 3.141592653589;
		
		double men1 = (float) (r * r * pai);
		double syu1 = (float) (2 * r * pai);
		
		String syu2 = String.format("%.5f", syu1);
		String men2 = String.format("%.5f", men1);
		System.out.println(men2 + " " + syu2);
		
	}
}