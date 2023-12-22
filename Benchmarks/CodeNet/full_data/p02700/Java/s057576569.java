import java.util.Scanner;

public class Main {
	public static void main(String[] args ) {

		Scanner scanner = new Scanner(System.in);
		int HPta = scanner.nextInt();
		int ATKta = scanner.nextInt();
		int HPao = scanner.nextInt();
		int ATKao = scanner.nextInt();

		while (HPao>=0 || HPta>=0){
			HPao -= ATKta;
			HPta -= ATKao;
		}
		if (HPta>=0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		scanner.close();
	}
}
