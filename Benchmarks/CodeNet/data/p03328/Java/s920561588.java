import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = sc.nextInt();

      int sum1 = 0;

      for (int j = 0;j<499500 ;j++ ) {
        sum1 += j;
        int sum2  = sum1 + (j+1);
        for (int i = 0;i<499500;i++ ) {
          if (sum1-i==a||sum2-i==b) {
            System.out.println(i);
            System.exit(0);
          }
        }
      }

      }
    }
