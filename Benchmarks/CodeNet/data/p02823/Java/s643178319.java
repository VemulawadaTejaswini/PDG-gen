import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();

      int mid = (b - a -1) % 2 == 1 ? (b - a) / 2 : Integer.MAX_VALUE;
      int left = b - 1;
      int right = n - a;
      System.out.println(Math.min(mid, Math.min(left, right)));
  }
}