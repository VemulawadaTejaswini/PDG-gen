import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(), K = sc.nextInt();
    int H[] = new int[N];
    for (int i = 0; i < N; i++) H[i] = sc.nextInt();
    Arrays.sort(H);
    int sum = 0;
    for (int i = 0; i < N - K; i++) sum += H[i];
    System.out.println(sum);
  }
}