import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      long N = sc.nextLong();
      long min = N;

      for(long i = N;i>1;i--){
        for(long j =1;j<i;j++){
          if(N==i*j){
            min = Math.min(i+j,min);
            continue;
        }
          if(i*j>N){
            continue;
          }
        }
      }
      System.out.println(min-2);


                   }
}