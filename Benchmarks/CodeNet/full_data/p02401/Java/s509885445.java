import java.util.Scanner;

public class Main {
    public static void main(String args[]){
	Scanner in = new Scanner(System.in);

	int a,b;
	String op;
	
	int s = 0;
	while (true){
		a  = in.nextInt();
		op  = in.next();
		b  = in.nextInt();
		if (op.equals("?")){
			break;
		}else if (op.equals("+")){
			s = a + b;
		}else if (op.equals("-")){
			s = a - b;
		}else if (op.equals("*")){
			s = a * b;
		}else if (op.equals("/")){
			s = a / b;
		}
		System.out.println(s);
	}	
    }   
}