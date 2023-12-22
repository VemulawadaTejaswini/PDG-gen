import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = Integer.parseInt(sc.nextLine());

		sc.close();

		System.out.println(multiply(x, 3));
	}

	private static int multiply(int a, int b) {
		int result = 1;
		for (int i = 0; i < b; i++) {
			result *= a;
		}
		return result;
	}

}

