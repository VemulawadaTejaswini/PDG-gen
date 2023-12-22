import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[])  throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 0;
		String op = "";
		int b = 0;
		boolean end = false;

		while (end == false) {
			String[] tmp = br.readLine().split(" ");
			a = Integer.parseInt(tmp[0]);
			op = tmp[1];
			b = Integer.parseInt(tmp[2]);

			switch (op) {
			case "+":
				System.out.println(a + b);
				break; 
			case "-":
				System.out.println(a - b);
				break;
			case "*":
				System.out.println(a * b);
				break;
			case "/":
				System.out.println(a / b);
				break;
			case "?":
				end = true;
				break;
			default:

			}
		}

	}
}