import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double[] v = new double[n];
    for(int i = 0; i < n; i++) {
      v[i] = sc.nextDouble();
    }
    Arrays.sort(v);
    double ans = v[n - 1];
    for(int i = n - 2; i >= 0; i--) {
      ans = (ans + v[i]) / 2; 
    }
    System.out.println(ans);
  }
}
