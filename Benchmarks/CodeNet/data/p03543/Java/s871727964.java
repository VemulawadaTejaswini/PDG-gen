import java.util.*;
 
public  class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int N = scan.nextInt();
      	int a = N / 1000;
      	int b = N / 100 - 10 * a;
      	int c = N / 10 - 100 * a - 10 * b;
      	int d = N % 10;
     	if(a == b && b == c && c == d){
        	System.out.print("Yes");
        }	
      	else if(a == b && b == c){
        	System.out.print("Yes");
        }
      	else if(b == c && c == d) {
         	System.out.print("Yes"); 
        }
      	
      	else {
        	System.out.print("No");
        }
    
    }
 
}