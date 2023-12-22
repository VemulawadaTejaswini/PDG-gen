import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> porand = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")));
		sc.close();
		List<String> stack = new ArrayList<>();
		for(String value: porand) {
			 if(isNumber(value)) {
				 push(stack, value);
			 } else {
				 String operand2 = pop(stack);
				 String operand1 = pop(stack);
				 String calcResult = calcResultGet(operand1, operand2, value);
				 push(stack, calcResult);
			 }
		}
		System.out.println(pop(stack));
	}
	public static void push(List<String> stack, String value) {
		stack.add(value);
	}
	public static String pop(List<String> stack) {
		int popIndex = stack.size() - 1;
		String value = stack.get(popIndex);
		stack.remove(popIndex);
		return value;
	}
	public static boolean isNumber(String value) {
		String numOnlyRegex = "[0-9]+";
		return value.matches(numOnlyRegex);
	}
	public static String calcResultGet(String operand1, String operand2, String enzanshi) {
		int operandNum1 = Integer.parseInt(operand1);
		int operandNum2 = Integer.parseInt(operand2);
		int calcResult = 0;
		switch (enzanshi) {
		case "+":
			calcResult = operandNum1 + operandNum2;
			break;

		case "-":
			calcResult = operandNum1 - operandNum2;
			break;

		case "*":
			calcResult = operandNum1 * operandNum2;
			break;
		}
		return String.valueOf(calcResult);
	}
}