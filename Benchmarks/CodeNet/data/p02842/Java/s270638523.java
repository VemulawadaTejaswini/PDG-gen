import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      double data=0;

      for (int i = 1; i<=n; i++) {
        data = i*1.08;
        if((int)data==n){
          System.out.println(i);
          System.exit(0);
        }
      }
        System.out.println(":)");
  }
}