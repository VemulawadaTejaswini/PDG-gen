import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int size = 105;
		
		Stack stack = new Stack(size);
		int a,b;
		
		try {
			String input_str[] = br.readLine().split("\\s+");
			for(int i=0; i<input_str.length; i++) {
				switch(input_str[i]) {
				case "+":
					
					a = stack.pop();
					b = stack.pop();
					stack.push(a+b);
					break;
				
				case "-":
					b = stack.pop();
					a = stack.pop();
					stack.push(a-b);
					break;
					
				case "*":
					a = stack.pop();
					b = stack.pop();
					stack.push(a*b);
					break;
					
				default:
					stack.push(Integer.parseInt(input_str[i]));
					break;
				}
			}
			System.out.println(stack.pop());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}

class Stack {
	private int num[];
	private int top;
	
	Stack(int arg_size){
		num = new int[arg_size];
		top = 0;
	}
	
	public void push(int x) {
		num[top++] = x;
	}
	
	public int pop() {
		top--;
		return num[top];
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
}

