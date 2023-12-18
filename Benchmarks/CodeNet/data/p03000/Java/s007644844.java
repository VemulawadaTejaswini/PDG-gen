import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int x = sc.nextInt();
      int[] data = new int[n];
      int sum = 0;
      int count = 0;

      for (int i = 0;i<n ;i++ ) {
        data[i] = sc.nextInt();
      }
      for (int i = 0;sum<=x ;i++ ) {
        sum = sum + data[i];
        count++;
      }
      System.out.println(count);
}
}
