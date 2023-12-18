import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

      int[] data = new int[n];
      int sum = 0;
      int max = 0;
      for (int i = 0;i<n ;i++ ) {
        data[i] = sc.nextInt();
        max = Math.max(max,data[i]);
        sum += data[i];
      }
      System.out.println(sum-max+max/2);



}
}
