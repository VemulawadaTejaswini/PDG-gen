import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private Scanner sc;

	private int p;
	private String line;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		int lines = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < lines; i++) {
			line = sc.nextLine();
			
			p = 0;
			System.out.println(expression());
		}
	}

	private int expression() {
		double value = term();
		
		return (int)sub_expression(value);
	}
	
	private int sub_expression(double value) {
		if (line.charAt(p) == '+') {
			p++;
			
			value = value + term();
			value = sub_expression(value);
		} else if (line.charAt(p) == '-') {
			p++;
			
			value = value - term();
			value = sub_expression(value);
		}
		
		return (int)value;
	}
	
	private int term() {
		double value = factor();
		
		return (int)sub_term(value);
	}
		
	private int sub_term(double value) {
		if (line.charAt(p) == '*') {
			p++;
			
			value = value * factor();
			value = sub_term(value);
		} else if (line.charAt(p) == '/') {
			p++;
			
			value = value / factor();
			value = sub_term(value);
		}
		
		return (int)value;
	}
	
	private int factor() {
		double value = 0;
		
		switch (line.charAt(p)) {
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			value = Integer.parseInt("" + line.charAt(p));
			p++;
			break;
		case '(':
			p++;
			
			value = expression();
			p++;
			break;
		}
		return (int)value;
	}
}