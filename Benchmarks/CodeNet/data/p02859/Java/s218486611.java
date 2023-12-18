import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		scan.close();

		int s = r * r;
		System.out.print(s);

	}
}