import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> x = new ArrayList<>();
		while (true) {
			int a = Integer.parseInt(in.next());
			String op = in.next();
			int b = Integer.parseInt(in.next());
			if (op.equals("?")) {
				break;
			}
			switch (op) {
			case "+":
				x.add(a + b);
				break;
			case "-":
				x.add(a - b);
				break;
			case "*":
				x.add(a * b);
				break;
			case "/":
				x.add(a / b);
				break;
			}
		}
		
		for (Integer ans : x) {
			System.out.println(ans);
		}
	}
}	
