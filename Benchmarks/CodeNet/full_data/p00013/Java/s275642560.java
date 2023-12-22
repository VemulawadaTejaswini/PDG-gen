import java.util.Stack;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str;
		Stack<String> s = new Stack<String>();
		while (null != (str = in.readLine())){
			doit(str,s);
		}
	}
	
	private static void doit(String str,Stack<String> s){
		if(str=="0")
			System.out.println(s.pop());
		else s.push(str);
	}

}