import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = null;
		String[] str = new String[3];
		int a;
		int b;
		String op;
		int result;

		do {
			st = sc.nextLine();
			str = st.split(" ");
			result = 0;

			a = Integer.parseInt(str[0]);
			op = str[1];
			b = Integer.parseInt(str[2]);

			if (op.equals("?")) {
				sc.close();
				break;
			}

			switch(op) {
				case "+":
					result = a + b;
					break;
				case "-":
					result = a - b;
					break;
				case "*":
					result = a * b;
					break;
				case "/":
					result = a / b;
					break;
			}
			System.out.println(result);
		}while(true);


	}

}
