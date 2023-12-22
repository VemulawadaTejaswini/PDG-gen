import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			if (s.equals("#")) {
				break;
			}
			s = s.replace(" ", "");
			Expression exp = new Expression(s);
			System.out.println(exp.value());
		}
	}

}
class Expression {
	private String expression;
	private int begin = 0;
	public Expression(String expression) {
		this.expression = expression;
	}
	public long value() {
		long num = term();
		while(begin+2<expression.length()) {
			if (expression.charAt(begin+2) == '>') {
				break;
			}
			begin += 2;
			long t = term();
			if (t < 32) {
				num = (num >> t);
			}else{
				num = 0;
			}
		}
		return num;
	}
	private long term() {
		long num;
		if (expression.charAt(begin) == 'S') {
			begin+=2;
			num = value();
			num = (num * num) % 1000000007;
			begin++;
		}else{
			num = number();
		}
		return num;
	}
	private long number() {
		long num = 0;
		while(begin<expression.length()) {
			if (Character.isDigit(expression.charAt(begin))) {
				num*=10;
				num+=expression.charAt(begin)-'0';
				begin++;
			}else{
				break;
			}
		}
		return num;
	}
}