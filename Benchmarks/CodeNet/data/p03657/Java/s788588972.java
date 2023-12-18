import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        String cnt;
        
        if( a % 3 == 0 )cnt = "Possible";
        else if( b % 3 == 0 )cnt = "Possible";
        else if( (a+b) % 3 == 0 )cnt = "Possible";
        
        else cnt = "Impossible";
            
        System.out.println(cnt);
	  }
}