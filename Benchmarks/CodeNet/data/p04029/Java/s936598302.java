
public class Main {
	public static void main(String[] args) {
		int candy = 0;
		int input = new java.util.Scanner(System.in).nextInt();

		for (int i = 0; i <= input; i++) {
			candy = candy + i;
		}
		System.out.println(candy);

	}
}