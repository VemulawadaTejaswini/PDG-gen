import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      long N = sc.nextLong();
      long min = N;

      for(long i = 1;i<N/2;i++){
        for(long j =1;j<N;j++){
          if(N==i*j){
            min = Math.min(i+j,min);
        }
        }
      }
      System.out.println(min-2);


                   }
}
