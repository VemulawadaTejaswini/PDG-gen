import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException{

    	while(true){

        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] strArr = br.readLine().split(" ");

            int a = Integer.parseInt(strArr[0]);
            String op = strArr[1];
            int b = Integer.parseInt(strArr[2]);

            if(op.equals("?")) break;

            switch(op){
            	case "+":
            		System.out.println(a + b);
            		break;
            	case "-":
            		System.out.println(a - b);
            		break;
            	case "*":
            		System.out.println(a * b);
            		break;
            	case "/":
            		System.out.println(a / b);
            		break;
            	default:
            		System.out.println("??£????????????????????\????????????????????????");
            		break;
            }

    	}
    }
}