import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	String[] stack = new String[1000000];
	int top = 0;
	
	void run() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] stringArray = br.readLine().split(" ");
		int result = 0;
		for (int i = 0; i < stringArray.length; i++) {
			
			if (stringArray[i].equals("+") ||
				stringArray[i].equals("-") ||	
				stringArray[i].equals("*") ||
				stringArray[i].equals("/")) {
				
				int x = Integer.parseInt(pop());
				int y = Integer.parseInt(pop());
				result = calc(stringArray[i], y ,x);
				push(String.valueOf(result));
			} else {
				push(stringArray[i]);
			}
		}
		System.out.println(result);
	}
	
	void push(String x) {
		top++;
		stack[top] = x;
	}
	
	String pop() {
		String x = stack[top];
		top--;
		return x;
	}
	
	int calc(String optor, int x , int y) {

		int result = 0;
		switch (optor) {
			case "+" :
				result = x + y;
				break;
			case "-":
				result = x - y;
				break;
			case "*":
				result = x * y;
				break;
			case "/":
				result = x / y;
				break;
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}