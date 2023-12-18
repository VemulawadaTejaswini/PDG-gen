import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		   String s = scanner.next();
		   int N = Integer.parseInt(s);
		   int count  = 0;
		   
		   for(int i = 0; i < s.length();) 
		   {
			   int j = Integer.parseInt(s.substring(i , i + 1));
			   count = count + j;
				i++;   
		   }
		    
		   if(N % count == 0) 
		   {
			   System.out.println("Yes");
		   }
		   else 
		   {
			   System.out.println("No");
		   }
		    scanner.close(); }
		  }