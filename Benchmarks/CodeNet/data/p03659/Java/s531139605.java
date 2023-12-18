import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] a = new int[N];
    int[] sum = new int[N + 1];
    long ans = 10000000;
    for (int i = 0; i < N; i++){
      a[i] = scanner.nextInt();
    }
    sum[0] = a[0];
    for (int i = 1; i < N; i++){
      sum[i] = sum[i - 1] + a[i];
    }
    for (int i = 0; i < N - 1; i++){
      ans = Math.min(ans, Math.abs(sum[N - 1] - 2 * sum[i]));
    }
    System.out.println(ans);
  }
}
