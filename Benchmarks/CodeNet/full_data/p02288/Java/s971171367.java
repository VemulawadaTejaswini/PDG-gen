import java.util.Scanner;
class Main {

  public static int left(int i) {
    return i * 2 + 1;
  }

  public static int right(int i) {
    return i * 2 + 2;
  }

  public static void buildMaxHeap(int[] A) {
    for (int i = A.length - 1; i >= 0; i--) {
      maxHeapify(A, i);
    }
  }

  public static void maxHeapify(int[] A, int i) {
    int l = left(i);
    int r = right(i);
    int largest;
    if (l < A.length && A[l] > A[i])
      largest = l;
    else
      largest = i;
    if (r < A.length && A[r] > A[largest])
      largest = r;
    if (largest != i) {
      int temp = A[i];
      A[i] = A[largest];
      A[largest] = temp;
      maxHeapify(A, largest);
    }
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] A = new int[n];
    for (int i = 0; i < n; i++) {
      A[i] = s.nextInt();
    }
    s.close();
    buildMaxHeap(A);
    for (int i = 0; i < n; i++) {
      System.out.print(" " + A[i]);
    }
    System.out.println();
  }
}


