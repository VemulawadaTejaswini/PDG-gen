import java.util.HashMap;
import java.util.Scanner;


public class Main {
	
       public static void main(String[] args) {
    	  Scanner input=new Scanner( System.in);
    	  
    	  long ans=0;
    	  String string=input.next();
    	  int len=string.length();
    	  
    	 if(string.charAt(0)==string.charAt(len-1))
    	 {
    		 if((len-2)%2==1)
    		 {
    			 System.out.println("Second");
    		 }
    		 else
    			 System.out.println("First");
    	 }
    	 else
    	 {
    		 if((len-2)%2==1)
    		 {
    			 System.out.println("First");
    			
    		 }
    		 else
    			 System.out.println("Second");
    	 }
    	 // System.out.println(ans);
          
	}
}
