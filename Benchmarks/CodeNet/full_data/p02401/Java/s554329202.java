import java.util.Scanner;
class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(;;){		
			int a = scanner.nextInt();
			String op = scanner.next();
			int b = scanner.nextInt();
			
			if ( op == "+" ){
				 System.out.println(a+b);
			} 
			else if ( op == "-" ){
				 System.out.println(a-b);
		    } 
		    else if ( op == "*" ){
				 System.out.println(a*b);
		    } 
			else if ( op == "/" ){
				 System.out.println(a/b);
		    } 
   		    else {
				break;
			}	
	    }
	}
}