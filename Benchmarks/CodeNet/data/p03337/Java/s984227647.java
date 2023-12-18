import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int a = Integer.parseInt(tokens[0]);
		int b = Integer.parseInt(tokens[1]);
		int x = a + b;
		int y = a - b;
		int z = a * b;
		int result = Math.max(Math.max(x, y), z);
		System.out.println(result);
		in.close();
	}

}