import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int x = sc.nextInt();
			System.out.println(x * x * x);
		} finally {
			sc.close();
		}
	}
}