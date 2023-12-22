
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String [] args){
		Stack<Integer> stack = new Stack<Integer>();
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		String [ ] strings = string.split(" ");
		int size = strings.length;
		int i = 0;
		while( i<size ){
			if("+".equals(strings[i])){
				int a = stack.pop();
				int b = stack.pop();
				int c = a+b;
				stack.push(c);
			}else if("-".equals(strings[i])){
				int a = stack.pop();
				int b = stack.pop();
				int c = b-a;
				stack.push(c);
			}else if("*".equals(strings[i])){
				int a = stack.pop();
				int b = stack.pop();
				int c = b*a;
				stack.push(c);
			}else{
				stack.push(Integer.parseInt(strings[i]));
				
			}
			i++;
		}
		
		System.out.println(stack.pop());
		scanner.close();
	}
}