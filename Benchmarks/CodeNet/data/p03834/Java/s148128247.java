import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    String s = scanner.nextLine();
		    String[] a = s.split(",");
		    
		    System.out.println(a[0] + " " + a[1] + " " + a[2]);
		    
		    scanner.close(); }
		  }