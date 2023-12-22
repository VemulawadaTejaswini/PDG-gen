import java.io.*;
import java.util.Arrays;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = (br.readLine()).split(" ");
		Stack stack = new Stack();
		for (int i = 0; i<str.length ; i++ ) {
			if (str[i].equals("+")) {
				int	a = Integer.parseInt((stack.pop()).toString());
				int	b =  Integer.parseInt((stack.pop()).toString());
				int	c = a+b;
				stack.push(c);	
			}else if(str[i].equals("-")){
				int	a =  Integer.parseInt((stack.pop()).toString());
				int	b =  Integer.parseInt((stack.pop()).toString());
				int	c = b-a;
				stack.push(c);	
			}else if (str[i].equals("*")) {
				int	a =  Integer.parseInt((stack.pop()).toString());
				int	b =  Integer.parseInt((stack.pop()).toString());		
				int	c = a*b;
				stack.push(c);	
			}else{
				stack.push(Integer.parseInt(str[i]));
				stack.push(Integer.parseInt(str[i+1]));
				i++;
			}
		}
		System.out.println(stack.pop());
	}
}