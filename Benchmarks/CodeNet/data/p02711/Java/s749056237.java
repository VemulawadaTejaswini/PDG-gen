import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long N = sc.nextLong();
            long sum = 0;
            for(long i = 1; i <= N;i++){
              if(i % 3 == 0 || i % 5 ==0 || i % 15 == 0){
              } else {
                sum += i;
              }
            }
            System.out.println(sum);
          }
}