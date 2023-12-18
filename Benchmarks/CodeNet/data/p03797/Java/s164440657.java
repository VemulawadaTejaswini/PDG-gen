import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong(),m = scanner.nextLong();
		long piece = m + n*2;
		System.out.println(piece/4);
	}

}
