import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = sc.nextInt();
      int sum = a;
      int count = 1;

      for (int i = 1;sum<b ;i++ ) {
        System.out.println(sum);
        sum = sum + a -1;
        count++;
      }
      System.out.println(count);
}
}
