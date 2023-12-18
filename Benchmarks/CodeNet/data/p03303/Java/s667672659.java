import java.util.Scanner;

public class Main {
	  public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);

		    String moji = scanner.next();
		   String[] array = moji.split(""); 
		    int w = scanner.nextInt();
		    
		    for(int i = 0; i * w <= moji.length();  i++) 
		    {
		    	System.out.print(array[i * w]);
		    }
        	scanner.close();}
		  }