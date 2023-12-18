import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        String before_s = scan.next();
        String s        = scan.next();
        String after_s  = scan.next();
            
        System.out.println(before_s.substring(0,1) + s.substring(0,1) + after_s.substring(0,1));
	  }
}