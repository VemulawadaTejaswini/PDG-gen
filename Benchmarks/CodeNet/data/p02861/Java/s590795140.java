import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int[] x = new int[N];
    int[] y = new int[N];
    
    for (int i = 0; i < N; i++) {
      x[i] = Integer.parseInt(sc.next());
      y[i] = Integer.parseInt(sc.next());
    }
    
    int X = 2 * factorial(N-1);
    
    double totalDist = 0;
    for (int i = 0; i < N-1; i++) {
      for (int j = i + 1; j < N; j++) {
        int xdist = x[i] - x[j];
        int ydist = y[i] - y[j];
        double dist = Math.sqrt(xdist*xdist + ydist*ydist);
        totalDist += dist * X;
      }
    }
    
    System.out.println(totalDist/factorial(N));
  }
  
  static int factorial(int n) {
    if (n == 1) {
      return 1;
    }
    return n * factorial(n - 1);
  }
}