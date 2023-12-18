import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int n = scan.nextInt();
        int cnt = 0;
        
        for( ; n > 0 ; n-- ){
          cnt += n;
        }
            
        System.out.println(cnt);
	  }
}