
//Simple Calculator
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String[] aOpb = in.readLine().split(" ");
			int a = Integer.parseInt(aOpb[0]);
			String op = aOpb[1];
			int b = Integer.parseInt(aOpb[2]);

			if(op.equals("?")){
				break;
			}
			
			int ans = 0;

			switch (op) {
			case "+":
				ans = a + b;
				break;
			case "-":
				ans = a - b;
				break;
			case "*":
				ans = a * b;
				break;
			case "/":
				ans = a / b;
				break;
			}

			System.out.println(ans);
		}

	}
}