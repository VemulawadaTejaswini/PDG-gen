import java.util.Scanner;
public class Main {


		public static void main(String[] args) {
	      
	      Scanner sc = new Scanner(System.in);
	      
	      String t = sc.next();
		String s =sc.next();
	      
	      t = t.substring(0,t.length() -2);

         
          
	       if(s.equals(t))
	       {
	         System.out.println("Yes");
	       }
	    else{
	       System.out.println("No");
	        }
	     }
	  }
