import java.util.*;

class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    double a[] = new double[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextDouble();
    }
    Arrays.sort(a);
    for (int i = 1; i < n; i++) {
      a[i] = (a[i] + a[i-1]) / 2;
    }
    System.out.println(a[n-1]);
  }
}
