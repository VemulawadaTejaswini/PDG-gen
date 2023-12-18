import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner sc = new Scanner(System.in);
		   
		    long x = sc.nextLong();
		    long count = 0;
		    count += 2 * (x/11);
		    if(x % 11 > 6) {
		    	count += 2;
		    }
		    else if(x % 11 != 0) {
		    	count += 1;
		    }
		    
		    System.out.println(count);
		    
		    sc.close(); }
		  }
