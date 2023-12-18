import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();

    int max = 1;
    for (int b = 2; b * b <= X; b++) {
      for (int p = 2; beki(b, p) <= X; p++) {
        int n = beki(b, p);
        if (max < n) {
          max = n;
        }
      }
    }
    System.out.println(max);
  }
  
  private static int beki(int b, int p) {
    if (p == 0) {
      return 1;
    }
    
    return b * beki(b, p-1);
  }
}