import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int X = scan.nextInt();
		
		double time = T/X;
		System.out.println(time);
	}
}
