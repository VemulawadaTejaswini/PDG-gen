import java.util.Scanner;
import java.lang.String;

public class Main{

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int a,b;
		String op;
		int d;
		
		while(true){
		    a = sc.nextInt();
		    op = sc.next();
		    b = sc.nextInt();
		    
		    if(op.equals("+")){
		        d = a+b;
		    }
		    else if(op.equals("-")){
		        d = a-b;
		    }
		    else if(op.equals("*")){
		        d = a*b;
		    }
		    else if(op.equals("/")){
		        d = a/b;
		    }
		    else{
		        sc.close();
		        return;
		    }
		    System.out.println(d);
		    
		}
	}

}
