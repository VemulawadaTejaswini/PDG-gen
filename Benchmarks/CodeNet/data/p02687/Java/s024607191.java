import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();

		if ("ABC".equals(n)) {
			System.out.println("ARC");
		} else if ("ARC".equals(n)){
			System.out.println("ABC");
		}
		sc.close();
	}

}
