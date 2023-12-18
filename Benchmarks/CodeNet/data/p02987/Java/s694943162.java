import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	String s = scan.next();
      	int acounter = 0;
      	int bcounter = 0;
      	if(s.charAt(0) == s.charAt(1)){
        	if(s.charAt(2) == s.charAt(3)){
            	System.out.print("Yes");
            }
          	else{
            	System.out.print("No");
            }
        }
      	else if(s.charAt(0) == s.charAt(2)){
        	if(s.charAt(1) == s.charAt(3)){
            	System.out.print("Yes");
            }
          	else{
            	System.out.print("No");
            }
        }
      	else if(s.charAt(0) == s.charAt(3)){
        	if(s.charAt(2) == s.charAt(1)){
            	System.out.print("Yes");
            }
          	else{
            	System.out.print("No");
            }
        }
      	else {
        	System.out.print("No");
        }
    }

}