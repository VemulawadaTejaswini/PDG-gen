import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long a = sc.nextInt();
      long b = sc.nextLong();
      long n = sc.nextLong();
      long left = 0, right = n;
      while(left <= right) {
        long mid1 = left + (right - left) / 3;
        long mid2 = right - (right - left) / 3;
        if(cal(mid1, a, b) <= cal(mid2, a, b)) {
          left = mid1 + 1;
        } else right = mid2 - 1;
      }
      System.out.println(cal(right < 0 ? 0 : right, a, b));
  }

  private static long cal(long x, long a, long b) {
    return (a * x) / b - a * (x / b);
  }
}