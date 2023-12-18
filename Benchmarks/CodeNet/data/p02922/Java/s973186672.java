import java.util.*;

class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int a = Integer.parseInt(sc.next());
	    int b = Integer.parseInt(sc.next());
	    
	    int counter = 1;
	   
	    while(a * counter - b < 0) {
	        ++counter;
	    }
	    System.out.println(counter);
	  
	}
}