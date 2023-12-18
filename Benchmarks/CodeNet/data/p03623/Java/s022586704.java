import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int x = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        char cnt;
        
        if( Math.abs(a-x) > Math.abs(b-x))cnt = 'B';
        else cnt = 'A';
            
        System.out.println(cnt);
	  }
}