import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[3];
    int gap = 0;

    for (int i = 0; i < 3; i++) {
      a[i] = sc.nextInt();
    }

    Arrays.sort(a);

    for (int i = 0; i < 2; i++) {
      gap += a[i+1] - a[i];
    }

    System.out.println(gap);
  }
}
