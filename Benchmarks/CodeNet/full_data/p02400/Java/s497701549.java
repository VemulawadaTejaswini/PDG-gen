import java.util.Scanner;

class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextInt();
		double pai = 3.141592653589;
		
		System.out.printf("%f %f\n", r*r*pai, 2*r*pai);
	}
}