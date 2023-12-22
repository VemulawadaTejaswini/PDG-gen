import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static long result = Long.parseLong(sc.nextLine());
	public static void main(String[] args) {
		calculator();

	}

	private static void calculator() {
		do {
				String op = sc.nextLine();

					if (op.equals("=")) {
						break;
					}

				int num = Integer.parseInt(sc.nextLine());

					switch(op) {
						case "+":
							result += num;
							break;
						case "-":
							result -= num;
							break;
						case "*":
							result *= num;
							break;
						case "/":
							result /= num;
							break;
						default:

						break;
					}

		}while(true);

		System.out.println(result);
	}

}
