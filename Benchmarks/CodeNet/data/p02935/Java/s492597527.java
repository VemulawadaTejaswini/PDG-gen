import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    
    Double[] v = new Double[n];
    List<Double> gu = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      v[i] = sc.nextDouble();
      gu.add(v[i]);
    }

    for (int i = 0; i < n - 1; i++) {
      Collections.sort(gu);
      double a = (gu.get(0) + gu.get(1)) / 2;
      gu.add(a);
      gu.remove(0);
      gu.remove(0);
    }
    
    System.out.println(gu.get(0));
    
  }
}
