import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		if(A > B) System.out.print("GREATER");
		else if(A < B) System.out.print("LESS");
		else System.out.print("EQUAL");
		scan.close();
	}
}
