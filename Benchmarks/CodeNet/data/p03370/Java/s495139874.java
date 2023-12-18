import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] m = new int[n];
    for (int i = 0; i < n; i++) {
      m[i] = sc.nextInt();
    }
    Arrays.sort(m);
    for (int i = 0; i < n; i++) {
      x -= m[i];
    }
    int count = n;
    while (x >= m[0]) {
      x -= m[0];
      count++;
    }
    System.out.println(count);
  }

}
