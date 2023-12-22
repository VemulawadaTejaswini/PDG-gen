import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] f = new int[N + 1];
    int x, y, z;
 
    for (int i = 1; i <= N; i++) {
      for (x = 1; x <= N; x++) {
        for (y = 1; y <= N; y++) {
          for (z = 1; z <= N; z++) {
            if (i == x * x + y * y + z * z + x * y + y * z + x * z)
              f[i]++;
          }
        }
      }
      System.out.println(f[i]);
    }
  }
}