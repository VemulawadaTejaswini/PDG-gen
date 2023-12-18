import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int S = sc.nextInt();

    int count = 0;

    for(int  X = 0 ; X <= K ; X ++){
      if(X > S){
        continue;
      }
      for(int  Y = 0 ; Y <= K ; Y ++){
        if(X + Y > S){
          continue;
        }
        for(int  Z = 0 ; Z <= K ; Z ++){
          if( X + Y + Z == S ){
            count ++ ;
          }
        }
      }
    }
    System.out.println(count);
  }
}
