import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int sumMin = N ;
    int[] digitA = new int[5];
    int[] digitB = new int[5];

    for(int A = 1 ; A < N ;A ++){
      int sum = 0;
      int B = N - A ;

      digitA[ 4 ] = A / 10000 ;
      digitA[ 3 ] = ( A % 10000 ) / 1000 ;
      digitA[ 2 ] = ( A %  1000 ) / 100  ;
      digitA[ 1 ] = ( A %  100  ) / 10   ;
      digitA[ 0 ] =   A %  10  ;

      digitB[ 4 ] = B / 10000 ;
      digitB[ 3 ] = ( B % 10000 ) / 1000 ;
      digitB[ 2 ] = ( B %  1000 ) / 100  ;
      digitB[ 1 ] = ( B %  100  ) / 10   ;
      digitB[ 0 ] =   B %  10  ;

      for(int i = 0 ; i < 5 ; i ++){
        sum = sum + digitA[i] + digitB[i] ;
      }
      if(sum < sumMin ){
        sumMin = sum ;
      }
    }
    System.out.println(sumMin);
  }
}
