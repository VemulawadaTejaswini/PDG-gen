import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] x = new long[N+1];
    for (int i =0; i<N+1; i++) {
      x[i] = sc.nextLong();
    }
    long dist; long D = Math.abs(x[1] - x[0]);
    for (int i =1; i<N+1; i++) {
      dist = Math.abs(x[i] - x[i - 1]);
      D = gcd(dist,D);
    }
    System.out.println(D);
  }
  
  static long gcd(long a, long b) {
    if (b > 0) {
      return gcd(b, a % b);
    } else {
      return a;
    } 
  }
}