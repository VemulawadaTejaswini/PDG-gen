import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {

  private static void reverse(long[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
      long tmp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = tmp;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int X = Integer.parseInt(scanner.next());
    int Y = Integer.parseInt(scanner.next());
    int Z = Integer.parseInt(scanner.next());
    int K = Integer.parseInt(scanner.next());
    long[] A = new long[X];
    long[] B = new long[Y];
    long[] C = new long[Z];
    for (int i = 0; i < X; i++) {
      A[i] = Long.parseLong(scanner.next());
    }
    for (int i = 0; i < Y; i++) {
      B[i] = Long.parseLong(scanner.next());
    }
    for (int i = 0; i < Z; i++) {
      C[i] = Long.parseLong(scanner.next());
    }
    Arrays.sort(A);
    Arrays.sort(B);
    Arrays.sort(C);
    reverse(A);
    reverse(B);
    reverse(C);
    ArrayList<Long> ABC = new ArrayList<Long>();
    for (int a = 0; a < X; a++) {
      for (int b = 0; b < Y; b++) {
        if ((a + 1) * (b + 1) > K) {
          break;
        }
        for (int c = 0; c < Z; c++) {
          if ((a + 1) * (b + 1) * (c + 1) > K) {
            break;
          }
          ABC.add(A[a] + B[b] + C[c]);
        }
      }
    }
    Collections.sort(ABC, Collections.reverseOrder());
    for (int i = 0; i < K; i++) {
      System.out.println(ABC.get(i));
    }
  }

}
