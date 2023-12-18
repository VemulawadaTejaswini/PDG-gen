import java.util.Scanner;

public class Main {
	  public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    String str = scanner.nextLine();
		    String[] s = str.split("");
		    int N = 0;
		   if(s[0] == "1")N++;
		   if(s[1] == "1")N++; 
		   if(s[2] == "1")N++;
		    
		    System.out.println(N);
		    scanner.close();}
		  }