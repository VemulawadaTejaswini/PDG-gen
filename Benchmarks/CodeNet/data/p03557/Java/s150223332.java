import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    int[] c = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for(int i = 0; i < n; i++) {
      b[i] = sc.nextInt();
    }
    for(int i = 0; i < n; i++) {
      c[i] = sc.nextInt();
    }
    Arrays.sort(a);
    Arrays.sort(b);
    Arrays.sort(c);
    long count = 0;
    for(int i = 0; i < b.length; i++) {
      int lowerIndex = lowerBound(a, b[i]);
      int lowerNumsCount = Math.max(0, lowerIndex);
      int upperIndex = upperBound(c, b[i]);
      int upperNumsCount = b.length - upperIndex;
      count += (lowerNumsCount * upperNumsCount);
    }
    System.out.println(count);
  }

  public static int lowerBound(int[] array, int value) {
    int left = -1;
    int right = array.length;
    while (right - left > 1) {
      int middle = (right + left) / 2;
      if (array[middle] >= value) {
        right = middle;
      } else {
        left = middle;
      }
    }
    return right;
  }

  public static int upperBound(int[] array, int value) {
    int left = -1;
    int right = array.length;
    while (right - left > 1) {
      int middle = (right + left) / 2;
      if (array[middle] > value) {
        right = middle;
      } else {
        left = middle;
      }
    }
    return right;
  }
}
