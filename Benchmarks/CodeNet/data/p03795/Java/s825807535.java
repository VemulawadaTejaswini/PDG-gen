import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		System.out.println(N * 800 - ((N / 15) * 200));
		scan.close();

	}

}
