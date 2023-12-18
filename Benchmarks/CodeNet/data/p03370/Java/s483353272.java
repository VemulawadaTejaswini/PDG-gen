import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] m = new int[n];

    for (int i = 0; i < n; i++) {
      m[i] = sc.nextInt();
      x -= m[i];
    }

    Arrays.sort(m);

    int count = 0;

    while (x >= m[0]) {
      x -= m[0];
      count++;
    }

    System.out.println(n+count);

  }

}
