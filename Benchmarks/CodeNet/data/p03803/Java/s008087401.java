import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        String cnt;
        
        if(a == 1)a = 14;
        if(b == 1)b = 14;
        
        if( a>b )cnt = "Alice";
        else if( a<b )cnt = "Bob";
        else cnt = "Draw";
            
        System.out.println(cnt);
	  }
}