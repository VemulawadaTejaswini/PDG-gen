import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int a,b;
		char op;
		int d;
		
		while(true){
		    a = sc.nextInt();
		    op = sc.next();
		    b = sc.nextInt();
		    
		    if(op == '+'){
		        d = a+b;
		    }
		    else if(op == '-'){
		        d = a-b;
		    }
		    else if(op == '*'){
		        d = a*b;
		    }
		    else if(op == '/'){
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
