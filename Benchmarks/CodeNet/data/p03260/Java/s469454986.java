import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      String ans = "Yes";
      if((a*b)%2==0){
        ans = "No";
      }
      System.out.println(ans);
}
