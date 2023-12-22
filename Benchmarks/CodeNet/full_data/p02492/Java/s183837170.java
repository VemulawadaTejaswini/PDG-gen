import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String op;
	
	do {
	    int a = sc.nextInt();
	    op = sc.next();
	    int b = sc.nextInt();
	    int res = 0;
	    
	    switch (op){
	    case "+":
		res = a + b;
		break;
	    case "-":
		res = a - b;
		break;
	    case "*":
		res = a * b;
		break;
	    case "/":
		double tmp = a / b;
		res = (int)Math.round(tmp);
		break;
	    default:
		break;
	    }
	    System.out.println(res);
	    
	}while(!op.equals("?"));
	
    }
}