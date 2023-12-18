import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    int k = 1;
    int l = 1;

    for (int i = 0; i < n; i++) {
      k *= 3;

      if (a[i]%2 == 0) {
        l *= 2;
      }
    }

    System.out.println(k-l);


  }

}
