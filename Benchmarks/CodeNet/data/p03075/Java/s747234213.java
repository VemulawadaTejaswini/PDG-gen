import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		int k = scan.nextInt();

		if(k >= e - a) {
			System.out.println(":(");
		}else {
			System.out.println("Yay!");
		}
	}
}