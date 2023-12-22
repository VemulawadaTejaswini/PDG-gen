import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] p = new int[N];
    int sum = 0;
    for (i =0; i < N; i++) {
      p[i] = sc.nextInt();
    }
    Array.sort(a)
    for (j = 0; j < K; j++) {
      sum += p[j];
    }
    System.out.println(sum);
  }
}