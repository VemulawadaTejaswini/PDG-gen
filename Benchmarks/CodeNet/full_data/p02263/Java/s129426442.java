import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		int num1 = 0;
		int num2 = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strArray[] = (br.readLine()).split(" ");
		Stack stack = new Stack(strArray.length);
		for(int i = 0;i < strArray.length; i++){
			if(strArray[i].equals("+")){
				num1 = stack.pop();
				num2 = stack.pop();
				stack.push(num1 + num2);
			}
			else if(strArray[i].equals("*")){
				num1 = stack.pop();
				num2 = stack.pop();
				stack.push(num1 * num2);
			}
			else if(strArray[i].equals("-")){
				num1 = stack.pop();
				num2 = stack.pop();
				stack.push(num2 - num1);
			}
			else{
				stack.push(Integer.parseInt(strArray[i]));
			}
		}
		System.out.println(stack.pop());
	}

}

class Stack{
	private int top;
	private int stack[];

	Stack(int size){
		stack = new int [size];
		top = 0;
	}

	public int pop(){
		return stack[--top];
	}

	public void push(int num){
		stack[top++] = num;
	}
}