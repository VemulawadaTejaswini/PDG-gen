import java.util.Scanner;

public class Main {
	public static void main(String[] args ) {

		Scanner scanner = new Scanner(System.in);
		int HPta = scanner.nextInt();
		int ATKta = scanner.nextInt();
		int HPao = scanner.nextInt();
		int ATKao = scanner.nextInt();

		while(true) {
			HPao -= ATKta;
			if(HPao<=0) {
				System.out.println("yes");
				break;
			}

			HPta -= ATKao;
			if(HPta<=0) {
				System.out.println("no");
				break;
			}
		}

		scanner.close();
	}
}