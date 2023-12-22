import java.util.Scanner;

public class Main {
  public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] S = new int[n];
    for (int i = 0; i < n; i++) {
      S[i] = sc.nextInt();
    }
    int q = sc.nextInt();
    int[] T = new int[q];
    for (int i = 0; i < q; i++) {
      T[i] = sc.nextInt();
    }
    int count = 0;
    for (int i = 0; i < T.length; i++) {
      if (binarySearch(S, T[i]))
        count++;
    }
    System.out.println(count);
  }

  private static boolean binarySearch(int[] S, int key) {
    int left = 0;
    int right = S.length - 1;
    int mid;
    while (left <= right) {
      mid = (right + left) / 2;
      if (S[mid] == key) {
        return true;
      } else if (S[mid] < key) {
        left = mid + 1;
      } else if (S[mid] > key) {
        right = mid - 1;
      }
    }
    return false;
  }
}
