import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] freq = new int[200001];
    for (int i = 0; i < n; i++) {
      int t = sc.nextInt();
      freq[t]++;
    }
    Arrays.sort(freq);
    int ans = n;
    for (int i = 0; i < k; i++) {
      ans -= freq[200000 - i];
    }
    System.out.println(ans);
  }
}
