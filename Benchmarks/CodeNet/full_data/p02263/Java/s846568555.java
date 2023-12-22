import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> operand = new Stack<Integer>();
		String input = sc.nextLine();
		sc.close();
		String num = "";
		
		for(int i = 0; i < input.length(); i++) {
			String temp = input.substring(i, i + 1);
			if(temp.contentEquals("+")) {
				int j = operand.pop();
				int k = operand.pop();
				operand.push(k + j);
			}
			else if(temp.contentEquals("-")) {
				int j = operand.pop();
				int k = operand.pop();
				operand.push(k - j);
			}
			else if(temp.contentEquals("*")) {
				int j = operand.pop();
				int k = operand.pop();
				operand.push(k * j);
			}
			else if(temp.trim().length() == 0 && num.length() > 0) {
				operand.push(Integer.parseInt(num));
				num = "";
			}
			else if(temp.trim().length() > 0){
				num = num.concat(temp);
			}
		}
		System.out.println(operand.pop());
	}
}

