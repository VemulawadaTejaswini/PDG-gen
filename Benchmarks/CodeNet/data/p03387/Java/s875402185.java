import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      if(a == b && b == c) {
        System.out.println(0);
        return;
      }
      int max = Math.max(a, Math.max(b, c));
      int min = Math.min(a, Math.min(b, c));
      int mid = a + b + c - max - min;
      int cost = 0;
      if(min % 2 != mid % 2) {
        max += 1;
        mid += 1;
        cost++;
      }
      cost += max - mid;
      if((mid - min) % 2 == 0) {
        cost += (mid - min) / 2;
      } else {
        cost++;
        cost += (mid - min - 1) / 2;
      }

      System.out.println(cost);
  }
}