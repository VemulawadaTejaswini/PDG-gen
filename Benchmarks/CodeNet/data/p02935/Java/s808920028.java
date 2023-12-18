import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double[] v = new double[N];
    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      v[i] = (double)a;
    }
    Arrays.sort(v);
    
    int count = 0;
    while (count < v.length-1) {
      double x = (v[count] + v[count+1])/2;
      v[count] = 0;
      v[count+1] = x;
      count++;
      Arrays.sort(v, count, v.length);
    }
    
    System.out.println(v[count]);
  }
}