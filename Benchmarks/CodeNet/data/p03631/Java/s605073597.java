import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        String n = scan.next();
        String cnt;
        
        String n_top    = n.substring(0,1);
        String n_bottom = n.substring(2,3);
        
        if( n_top.charAt(0) == n_bottom.charAt(0) )cnt = "Yes";
        else cnt = "No";
            
        System.out.println(cnt);
	  }
}