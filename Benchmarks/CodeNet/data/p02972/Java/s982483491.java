import java.util.*;

public class Main{
	public static void main(String args[]){
    	Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] remainder_a = new int[N];
        int[] remainder_b = new int[N];
        for(int i = 0; i < N; i++){
            remainder_a[i] = scanner.nextInt();
            remainder_b[i] = 0;
        }
      
       /*
       * 最後の箱(Nコ目)の余りは、以下の箱のボールの有無に依存しない
       * そのため、最後の箱からあまりを考えていくのが良さそう
       */
       for(int i = 1; i < N+1; i++){
           int total_b = 0;
           
           for(int j = i; j < N+1; j += N+1-i){
                total_b += remainder_b[N - j];
           }
         
           if(remainder_a[N-i] == 1 && total_b % 2 == 0){
               remainder_b[N-i] = 1;
           }
       }
        
      int count_b = 0;
      for(int i = 0; i < N; i++){
          if(remainder_b[i] == 1){
              count_b++;
          }
      }
      System.out.print(count_b);
      
      System.out.println("");
      
      boolean flg = true;
      for(int i = 0; i < N; i++){
          if(remainder_b[i] == 1){
              System.out.print(remainder_b[i] + " ");
              flg = false;
          }
      }
      
      if(flg){
        System.out.println(0);
      } 
    }
}