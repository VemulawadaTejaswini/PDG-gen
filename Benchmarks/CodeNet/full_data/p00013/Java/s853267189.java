import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class Main{
	public static void main(String[] args) throws IOException {
		Stack<String> stack = new Stack<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str="";
		while((str = br.readLine())!=null){
			if(str.equals("0")){
				System.out.println(stack.pop());
			}
			else{
				stack.push(str);
			}
		}
	}
}