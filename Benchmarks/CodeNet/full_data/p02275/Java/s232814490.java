import java.util.Scanner;

class Main {
  static int[] C = new int[10001];

  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int size = Integer.parseInt(sc.next());
    int current = 0;

    int[] A = new int[size];
    int[] B = new int[size + 1];

    for (int i = 0; i < size; i++) {
      A[i] = Integer.parseInt(sc.next());
      C[A[i]]++;
    }

    for (int i = 1; i < 10001; i++) {
      C[i] += C[i - 1];
    }

    for (int i = size - 1; i > -1; i--) {
      B[C[A[i]]--] = A[i];
    }

    for (int i = 1; i < size; i++) {
      System.out.print(B[i] + " ");
    }
    System.out.println(B[size]);
  }
}

