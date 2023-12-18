import java.util.Scanner;

public class B {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    char[] A = sc.next().toCharArray();
    int N = A.length;
    int[] count = new int[26];
    for (int i = 0; i < N; i++) {
      count[A[i] - 'a']++;
    }
    long ans = 1;
    for (int i = 0; i < N; i++) {
      count[A[i] - 'a']--;
      ans += N - i - 1 - count[A[i] - 'a'];
    }
    System.out.println(ans);
  }

}
