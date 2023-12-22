import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String str = br.readLine();
			if(str==null){
				break;
			}
			String s[] =str.split(" ");
			Stack<Double> stack = new Stack<Double>();
			for(int i = 0; i < s.length;i++){
				if(s[i].equals("+")){
					double a = stack.pop();
					double b = stack.pop();
					stack.push(a+b);
				}
				else if(s[i].equals("-")){
					double a = stack.pop();
					double b = stack.pop();
					stack.push(b-a);
				}
				else if(s[i].equals("*")){
					double a = stack.pop();
					double b = stack.pop();
					stack.push(a*b);
				}
				else if(s[i].equals("/")){
					double a = stack.pop();
					double b = stack.pop();
					stack.push(b/a);
				}
				else{
					stack.push(Double.parseDouble(s[i]));
				}
			}
			System.out.printf("%.6f\n", stack.pop());
		}

	}

}