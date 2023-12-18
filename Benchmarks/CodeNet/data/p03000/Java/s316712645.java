import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();

    int[] l = new int[n];
    int[] data = new int[n+1];

    for (int i = 0; i < n; i++) {
      l[i] = sc.nextInt();
    }

    data[0] = 0;

    for (int i = 1; i < n+1; i++) {
      data[i] = data[i-1] + l[i-1];
    }

    int count = 0;

    for (int i = 0; i < n+1; i++) {
      if (data[i] <= x) {
        count++;
      }
    }

    System.out.println(count);

  }

}
