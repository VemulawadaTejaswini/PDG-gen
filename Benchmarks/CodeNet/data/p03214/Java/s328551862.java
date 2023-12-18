import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double[] a = new double[n];
    double sum = 0;
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextDouble();
      sum += a[i];
    }
    double av = sum / (double)n;
    double t = 1000;
    for(int i = 0; i < n; i++) {
      t = Math.min(t, Math.abs(av - a[i]));
    }
    for(int i = 0; i < n; i++) {
      if(Math.abs(av - a[i]) == t) {
        System.out.println(i);
        break;
      }
    }
  }
}