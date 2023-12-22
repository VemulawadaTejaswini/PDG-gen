
import java.util.*;

public class Main{
    public static void main(String[]args){
      Scanner scan = new Scanner(System.in);

      long a = scan.nextInt();
      long b = scan.nextInt();
      long c = scan.nextInt();
      long k = scan.nextInt();

      long result= 0;


      for(int i=0; i<k; i++){
          if(a>0){
              result++;
              a--;
          } else if (b>0) {
              result += 0;
              b--;
          } else if (c>0){
              result--;
              c--;
          }
      }

        System.out.println(result);

    }
}
