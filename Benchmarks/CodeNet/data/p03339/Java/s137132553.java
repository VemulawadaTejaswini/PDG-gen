import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();

    int[] sumOfEast = new int[ N ];

    sumOfEast[ 0 ] = S.charAt( 0 ) == 'E' ? 1 : 0 ;
    for(int i = 1 ; i < sumOfEast.length; i++){
      if( S.charAt( i ) == 'E' ){
        sumOfEast[ i ] = sumOfEast[ i - 1 ] + 1;
      } else{
        sumOfEast[ i ] = sumOfEast[ i - 1 ] ;
      }
    }
    for(int i = 0 ; i < sumOfEast.length ; i ++){
//      System.out.println(sumOfEast[i]);
    }

    //端点リーダの場合　
    int countMin = sumOfEast[ N - 1 ] - sumOfEast[ 0 ]  ;
    int count    = 0;


//      System.out.println( "i = " + 0  );
//      System.out.println( "sumOfEast[ N - 1 ] - sumOfEast[ 0 ] = " + ( sumOfEast[ N - 1 ] - sumOfEast[ 0 ] ) );

    for(int i = 1; i < S.length() ; i ++){

      int West0_i = i  - sumOfEast[ i - 1 ]  ;
      int Easti1_N_1 = sumOfEast[ N - 1 ] - sumOfEast[ i ] ;
//      System.out.println( "i = " + i  );
//      System.out.println( "West0_i = " + West0_i  );
//      System.out.println( "Easti1_N_1 = " + Easti1_N_1  );

      count =  West0_i +  Easti1_N_1 ;

      if( countMin > count  ){
        countMin = count;
      }
    }
    System.out.println(countMin);


  }
}
