import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		StringBuilder str = new StringBuilder();

		int z = 0;

		while (true) {

			int x = scan.nextInt();
			String op = scan.next();
			int y = scan.nextInt();

			if (op.equals("+"))
				z = x + y;
			if (op.equals("-"))
				z = x - y;
			if (op.equals("*"))
				z = x * y;
			if (op.equals("/"))
				z = x / y;

			if (op.equals("?"))
				break;

			str.append(z + "\n");
		}

		System.out.print(str);

	}
}