import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class Main {

	public static void main(String[] args) {
		try {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String[] str = buf.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[2]);
			String operator = str[1];
			if(operator.equals("+")) { 
				  System.out.println(a + b);
			 }else if(operator.equals("-")) { 
				  System.out.println(a - b);
			 }else if(operator.equals("*")) { 
				  System.out.println(a * b);
			 }else 	if(operator.equals("/")) { 
				  System.out.println(a / b);
			 }else if(operator.equals("?")) {
				break;			
			 }else {
					return;
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}