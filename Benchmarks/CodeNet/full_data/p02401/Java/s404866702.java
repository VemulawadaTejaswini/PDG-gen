import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String [] input = sc.nextLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[2]);
			int result = 0;
			
			switch(input[1]) {
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
			
			if (input[1].equals("?")) {
				break;
			}
			
			System.out.println(result);
		}
	}
}

