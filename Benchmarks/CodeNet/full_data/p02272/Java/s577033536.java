import java.util.Scanner;

class Main {

  static int count;
  static int SENTINEL = 500001;

  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int size = Integer.parseInt(sc.next());
    int[] elements = new int[size];
    for (int i = 0; i < size; i++) {
      elements[i] = Integer.parseInt(sc.next());
    }

    mergeSort(elements, 0, size);

    for (int i = 0 ; i < size - 1; i++) {
      System.out.print(elements[i] + " ");
    }

    System.out.println(elements[size - 1]);
    System.out.println(count);
  }

  public static void mergeSort(int[] elements, int left, int right) {
    if (left + 1 < right) {
      int mid = (left + right) / 2;
      mergeSort(elements, left, mid);
      mergeSort(elements, mid, right);
      merge(elements, left, mid, right);
    }
  }

  public static void merge(int[] elements, int left, int mid, int right) {
    int n1 = mid - left;
    int n2 = right - mid;

    int[] l = new int[n1+1];
    int[] r = new int[n2+1];

    for (int i = 0; i < n1; i++) {
      l[i] = elements[left + i];
    }
    for (int i = 0; i < n2; i++) {
      r[i] = elements[mid + i];
    }
    l[n1] = SENTINEL;
    r[n2] = SENTINEL;

    int i = 0 ;
    int j = 0;
    for (int k = left; k <= right; k++) {
      if (l[i] <= r[j] && l[i] != SENTINEL) {
        elements[k] = l[i];
        count++;
        i++;
      } else if (r[j] != SENTINEL) {
        elements[k] = r[j];
        count++;
        j++;
      }
    }
  }
}

