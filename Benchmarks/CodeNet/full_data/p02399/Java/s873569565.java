import java.util.Scanner;
class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numA = scan.nextInt();
		int numB = scan.nextInt();
		int quo = numA / numB;
		int rem = numA % numB;
		double de = 1.0*numA / numB;
		String dec = String.format("%.8f", de);
		System.out.println(quo+" "+rem+" "+dec);
	}	
}