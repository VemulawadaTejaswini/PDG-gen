import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int N = scan.nextInt();
        int D[] = new int[N];
        int num_length[] = new int[N];
        int max_length = 0;
        
        long cnt = 1;
        
        //標準入力-----------------------
        for( int i = 0 ; i < N ; i++ ){
          D[i] = scan.nextInt();
          
          num_length[ D[i] ] += 1;
          
          if(max_length < D[i])max_length=D[i];
        }
        //-------------------------------
        if( D[0] != 0 ){
          cnt = 0;
        }
        else if( num_length[0] != 1 ){
          cnt = 0;
        }
        else{
          for( int i = 1 ; i < max_length ; i++ ){
            //powだと数字がでかい時にエラーになる
            //cnt *= (long)Math.pow( num_length[i] , num_length[i+1]  );
            for( int j = 0 ; j < num_length[i+1] ; j++){
              cnt = (long)cnt * (long)num_length[i];
            }
          }
        }
         
        //cnt = (long)998244354 * (long)3;
        //cnt = (long)Math.pow( 998244354 , 2  );
        //cnt = (long)998244354 * (long)998244354;
            
        System.out.println(cnt % (long)998244353);
	  }
}