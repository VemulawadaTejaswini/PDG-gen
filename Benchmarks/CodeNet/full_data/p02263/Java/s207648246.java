import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	String[] inputs = scan.nextLine().split(" ");
	int[] operands = new int[100];
	int cursol = 0;
	for (int i = 0; i < inputs.length; i++) {
	    int n = -1;
	    if (isOperator(inputs[i])) {
		int op1 = operands[cursol - 2];
		int op2 = operands[cursol - 1];
		if (inputs[i].equals("+")) {
		    n = op1 + op2;
		}
		if (inputs[i].equals("-")) {
		    n = op1 - op2;
		}
		if (inputs[i].equals("*")) {
		    n = op1 * op2;
		}
		cursol -= 2;
	    }
	    else {
		n = Integer.parseInt(inputs[i]);
	    }
	    operands[cursol++] = n;
	}
	System.out.println(operands[0]);
    }
    static boolean isOperator (String a) {
	if (a.equals("+") || a.equals("-") || a.equals("*")) {
	    return true;
	}
	return false;
    }
}