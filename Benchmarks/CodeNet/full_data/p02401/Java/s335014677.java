import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
	    while(true){
	 	    int a = Integer.parseInt(std.next());
	 	    String op = std.next();
	 	    int b = Integer.parseInt(std.next());

	 	    if(op == "+") System.out.println(a+b);
	    	else if(op == "-") System.out.println(a-b);
	    	else if(op == "*") System.out.println(a*b);
	    	else if(op == "/") System.out.println(a/b);
	    	else break;
	    }
	}
}