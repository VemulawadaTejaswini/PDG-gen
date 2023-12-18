import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int n = scan.nextInt();
        int a[] = new int[n];
        
        int cnt = 0;
        int check_same = 0;
        int max_num = -101;
        boolean isAllsame = true;
        
        int about_ave = 0;
        int min_cost = Integer.MAX_VALUE;
        
        for(int i = 0 ; i < n ; i++){
          a[i] = scan.nextInt();
          
          if(i == 0)check_same = a[i];
          else{
            if(check_same != a[i])isAllsame = false;
          }
          
          about_ave += a[i];
          
          if( max_num < a[i] )max_num =a[i];
        }
        
        about_ave /= n;
        
        for( int j = about_ave ; j < max_num ; j++ ){
          int tmp_cost = 0;
          
          for( int i = 0 ; i < n ; i++ ){
            tmp_cost += (a[i] - j) * (a[i] - j);
          }
          //System.out.println("!"+ tmp_cost);
          
          if(tmp_cost < min_cost)min_cost = tmp_cost;
        }
        
        if( isAllsame )
          cnt = 0;
        else
          cnt = min_cost;
        
        System.out.println(cnt);
	  }
}