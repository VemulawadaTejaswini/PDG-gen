import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	String s = scan.next();
      	int counter = 0;
      	if(s.substring(0,1) == "o"){
        	counter++;
        }
      	if(s.substring(1,2) == "o"){
        	counter++;
        }
      	if(s.substring(2,3) == "o"){
        	counter++;
        }
      	System.out.print(700 + counter * 100);
    }
}