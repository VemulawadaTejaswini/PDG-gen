import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        
	        if(n == 1){
	        	System.out.println("Hello World");
	        }else if(n == 2){
	        	
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        int c = 0;
		        
	        	c = a + b;
	        	System.out.println(c);
	        }
	}
}