import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println((int)Math.pow(Integer.parseInt(scan.next()), 3));
		scan.close();
	}
}
