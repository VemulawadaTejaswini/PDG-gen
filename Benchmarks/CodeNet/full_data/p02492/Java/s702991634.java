import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner n = new Scanner(System.in);
		int a,b,x=0;
		String op;
		while(true){
		
			a = n.nextInt();
			op = n.next();
			b = n.nextInt();
			if(op == "?") break;
			else{
				if(op .equals ("+")) x = a + b;
				else if(op .equals ("-")) x = a - b;
				else if(op .equals ("*")) x = a * b;
				else if(op .equals ("/")) x = a / b;
				}
			System.out.println( x );

		}
	
	}

}