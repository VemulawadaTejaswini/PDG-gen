import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    long[] h = new long[N];
    for (int i =0; i<N; i++) {
      h[i] = sc.nextLong();
    }
    Arrays.sort(h);
    long min =1000000000;
    for (int i =0; i<N-K+1; i++) {
      min = Math.min(h[i+N-K] - h[i],min);
    }
    System.out.println(min);
  }
}