import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    	Scanner sc = new Scanner(System.in);

        String N = sc.next();    	
        String A = sc.next();
        String B = sc.next();

        int aValue = Integer.parseInt(A);
        int bValue = Integer.parseInt(B);
        
        String ans = "Hello World";
        
        if( N == "1"){
        	System.out.print(ans);
        } else {
        	System.out.print(aValue+bValue);
        }

        
        
        
    }
  }