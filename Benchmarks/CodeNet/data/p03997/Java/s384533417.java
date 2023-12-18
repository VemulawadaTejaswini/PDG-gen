import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a= scanner.nextInt();
		int b= scanner.nextInt();
		int h= scanner.nextInt();

		int sq = (a+b)*h/2;
		System.out.println(sq);
		scanner.close();
	}

}
