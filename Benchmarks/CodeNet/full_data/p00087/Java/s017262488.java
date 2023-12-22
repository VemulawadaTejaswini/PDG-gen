import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String input = br.readLine();
			
			if(input == null){
				break;
			}
			
			System.out.printf("%.6f\n",PolandCalc.calc(input));
		}
	}

}

class PolandCalc{
	public static double calc(String exp){
		Stack<Double> stack = new Stack<Double>();
		String[] tmpArray = exp.split(" ");
		
		for(int i = 0; i < tmpArray.length ;i++){
			if(tmpArray[i].equals("+")){
				stack.push(stack.pop() + stack.pop());
			}
			else if(tmpArray[i].equals("*")){
				stack.push(stack.pop() * stack.pop());
			}
			else if(tmpArray[i].equals("-")){
				stack.push(-(stack.pop() - stack.pop()));
			}
			else if(tmpArray[i].equals("/")){
				double tmp1 = stack.pop();
				double tmp2 = stack.pop();
				stack.push(tmp2/tmp1);
			}
			else {
				stack.push(Double.parseDouble(tmpArray[i]));
			}
		}
		
		return stack.pop();
	}
}