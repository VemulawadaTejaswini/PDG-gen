import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int cnt = 0;
        
        if( a == b && a == c )cnt = 1;
        
        else if( a == b || a == c || b == c)cnt = 2;
        
        else cnt = 3;
            
        System.out.println(cnt);
	  }
}