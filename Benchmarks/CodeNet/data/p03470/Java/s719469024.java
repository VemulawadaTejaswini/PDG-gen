import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    Set<Integer> lhs = new LinkedHashSet<Integer>();

    for (int i = 0; i < n; i++) {
      lhs.add(a[i]);
    }

    Object[] newa = lhs.toArray();

    System.out.println(newa.length);

  }
}