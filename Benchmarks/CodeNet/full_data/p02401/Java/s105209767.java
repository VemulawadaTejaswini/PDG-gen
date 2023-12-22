import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in), 1);
        String is;
        while(true){
        	is = br.readLine();
			String[] sp = is.split(" ");

			int a = Integer.parseInt(sp[0]);
			String op = sp[1];
			int b = Integer.parseInt(sp[2]);

	        switch(op){
	        case "+":
	        	System.out.println(a+b);
	        	break;
	        case "-":
	        	System.out.println(a-b);
	        	break;
	        case "/":
	        	System.out.println(a/b);
	        	break;
	        case "*":
	        	System.out.println(a*b);
	        	break;
	        case "?":
	        	return;
	        }
        }
    }
}