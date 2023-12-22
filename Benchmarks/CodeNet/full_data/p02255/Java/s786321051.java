import java.util.Scanner;

/**
 * Main<br/>
 *
 * @author Tomo
 * @see <http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_1_A&lang=ja>
 */
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    trace(A);
    insertionSort(A, N);
  }

  private static void insertionSort(int[] A, int N) {
    for (int i = 1; i < N; i++) {
      int v = A[i];
      int j = i - 1;
      while (j >= 0 && A[j] > v) {
        A[j + 1] = A[j];
        j--;
      }
      A[j + 1] = v;
      trace(A);
    }
  }

  private static void trace(int[] A) {
    StringBuffer sb = new StringBuffer();
    for (int a : A) {
      sb.append(a).append(" ");
    }
    System.out.println(sb.toString().trim());
  }
}

