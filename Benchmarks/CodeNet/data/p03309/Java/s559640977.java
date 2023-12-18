import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] B = new int[N];
    for (int i = 0; i < N; i++) {
      B[i] = sc.nextInt() - (i + 1);
    }
    Arrays.sort(B);
    int mid1 = B[N / 2];
    int mid2 = B[(N / 2) - 1];
    long ans1 = 0;
    long ans2 = 0;
    for (int i = 0; i < N; i++) {
      ans1 += Integer.max(B[i] - mid1, mid1 - B[i]);
      ans2 += Integer.max(B[i] - mid2, mid2 - B[i]);
    }
    System.out.println(ans1 < ans2 ? ans1 : ans2);
  }
}