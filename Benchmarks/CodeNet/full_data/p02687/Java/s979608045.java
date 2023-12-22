import java.util.Scanner;

public class Main{ 
	public static void main(String args[]){
    	String x = new String("ABC");
      	String y = new String("ARC");
      	Scanner scan = new Scanner(System.in);
      	String s = scan.next();
      	// System.out.println(s);
      	// System.out.println(x);
      	// System.out.println(y);
      	if(s.equals(x)) System.out.println(y);
      	else System.out.println(x);
      	scan.close();
    }
}