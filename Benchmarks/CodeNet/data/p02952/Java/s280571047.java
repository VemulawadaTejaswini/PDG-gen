import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    int ans = 0;
    for (int i = 1; i <= N; i++) {
      if (oddNumber(i)) {
        ans++;
      }
    }
    
    System.out.println(ans);
  }
  
  private static boolean oddNumber(int n) {
    int keta = 0;
    while (n != 0) {
      n /= 10;
      keta++;
    }
    return keta % 2 == 1;
  }
}