import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int a = scan.nextInt();
    int b = scan.nextInt();
    int[] h = new int[n];
    long s = 0;
    for (int i = 0; i < n; i++) {
      h[i] = scan.nextInt();
      s += (h[i] - 1) / a + 1;
    }
    long left = -1;
    long right = s;
    while (right - left > 1) {
      long mid = (left + right) / 2;
      if (possible(a, b, h, mid)) {
        right = mid;
      } else {
        left = mid;
      }
    }
    System.out.println(right);
  }
  
  private static boolean possible(int A, int B, int[] h_array, long p_maxp_maxp_max) {
    long p = 0;
    for (int h : h_array) {
      if (h <= p_maxp_maxp_max * B) {
        continue;
      }
      long pi = (h - p_maxp_max * B - 1) / (A - B) + 1;
      p += pi;
      if (p > p_max){
        return false;
      }
    }
    return true;
  }
}