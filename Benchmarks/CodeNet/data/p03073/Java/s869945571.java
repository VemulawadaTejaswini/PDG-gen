import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    int n = s.length();
    int sum1 = 0;
    int sum2 = 0;
      sum1 = 0;
      for (int i=0;i<n;i++){
        if (s.charAt(i) == '0'){
          if (i%2 == 1){
            sum1 += 1;
          }
        }
        else{
          if (i%2 == 0){
            sum1 += 1;
          }
        }
      }

      sum2 = 0;
      for (int i=0;i<n;i++){
        if (s.charAt(i) == '0'){
          if (i%2 == 0){
            sum2 += 1;
          }
        }
        else{
          if (i%2 == 1){
            sum2 += 1;
          }
        }
      }


    System.out.println(Math.min(sum1,sum2));
  }
}
