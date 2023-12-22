import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO ?????????????????????????????????????????????
		int a, b;
		int ans = 0;
		String str[];
		String op = "";

		while(!op.equals("?")){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        str = br.readLine().split(" ");
	        a = Integer.parseInt(str[0]);
	        op = str[1];
	        b = Integer.parseInt(str[2]);

	        switch(op){
		        case "+":
		        	ans = a + b;
		        	break;
		        case "-":
		        	ans = a - b;
		        	break;
		        case "*":
		        	ans = a * b;
		        	break;
		        case "/":
		        	ans = a / b;
		        	break;
	        }
	        if (!op.equals("?")) System.out.println(ans);

		}

	}

}