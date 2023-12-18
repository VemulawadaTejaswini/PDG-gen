import java.util.Scanner;

public class Main {
  private static int countPower(int n) {
    int count = 0;
    while (n % 2 == 0) {
      ++count;
      n /= 2;
    }
    return count;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 1;
    int max = 0;
    for (int i = 1; i <= n; ++i) {
      int count = countPower(i);
      if (max < count) {
        max = count;
        ans = i;
      }
    }

    System.out.println(ans);
    
    sc.close(); 
  }
}
