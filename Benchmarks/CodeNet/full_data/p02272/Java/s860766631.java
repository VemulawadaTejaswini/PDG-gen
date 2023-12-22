import java.util.Scanner;

class Main {
  static int count = 0;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    StringBuilder output = new StringBuilder();
    int n = in.nextInt();
    int[] A = new int[n];
    for (int i = 0; n != 0; i++) {
      A[i] = in.nextInt();
      n--;
    }
    mergeSort(A);
    for (int i = 0; i < A.length; i++) {
      output.append(A[i]);
      if (i != A.length - 1) output.append(" ");
    }
    System.out.println(output.toString());
    System.out.println(Main.count);
  }
  
  static void merge(int[] A, int left, int mid, int right) {
    int n1 = mid - left;
    int n2 = right - mid;
    int[] L = new int[n1];
    int[] R = new int[n2];
    for (int i = 0; i < n1; i++) { L[i] = A[left + i]; }
    for (int j = 0; j < n2; j++) { R[j] = A[mid +  j]; }
    int i = 0;
    int j = 0;
    for (int k = left; k < right; k++) {
      Main.count++;
      if      (i >= n1)       A[k] = R[j++];
      else if (j >= n2)       A[k] = L[i++];
      else if (L[i] <= R[j])  A[k] = L[i++];
      else                    A[k] = R[j++];
    }
  }
  
  static void mergeSort(int[] A) {
    int left = 0;
    int right = A.length;
    mergeSort(A, left, right);
  }
  
  static void mergeSort(int[] A, int left, int right) {
    if (left + 1 < right) {
      int mid = (left + right)/2;
      mergeSort(A, left, mid);
      mergeSort(A, mid, right);
      merge(A, left, mid, right);
    }
  }
  
}