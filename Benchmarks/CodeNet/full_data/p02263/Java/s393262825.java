import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String[] equation;
	equation = input.nextLine().split(" ");
	Stack<Integer> numbers = new Stack<Integer>();
	input.close();
	int solution = 0;
	for(int i = 0; i < equation.length; i++) {
		String operator;
		
		if(equation[i].equals("*") || equation[i].equals("+") || equation[i].equals("-")) {
			operator = equation[i];
			if(operator.equals("*")) {
				solution = (numbers.pop() * numbers.pop());
				numbers.push(solution);
			}
			else if(operator.equals("+")) {
				solution = (numbers.pop() + numbers.pop());
				numbers.push(solution);
			}
			else if(operator.equals("-")) {
				int first = numbers.pop();
				int second = numbers.pop();
				solution = ( second - first );
				numbers.push(solution);
			}
			
			
		}
		else {
			numbers.push(Integer.parseInt(equation[i]));
		}
		
		
	}
	System.out.println(solution);

		
	}
	
	

}
