import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        String S = scan.next();
        String T = scan.next();
        int cnt = 0;
        
        for( int i = 0 ; i < 3 ; i++){
          if( S.substring(i,i+1).charAt(0) ==T.substring(i,i+1).charAt(0) )
            cnt++;
        }
            
        System.out.println(cnt);
	  }
}