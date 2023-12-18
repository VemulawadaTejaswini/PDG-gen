import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int n = scan.nextInt();
        int cnt = 1;
        int h[] = new int[n];
        
        int my_height;
        
        for( int i = 0 ; i < n; i++){
          h[i] = scan.nextInt();
        }
        
        for( int i = n-1 ; i > 0 ; i-- ){
          my_height = h[i];
          cnt++;
          for( int j = i ; j >= 0 ; j-- ){
            if( my_height < h[j] ){
              cnt--;
              break;
            }
          }
        }
            
        System.out.println(cnt);
	  }
}