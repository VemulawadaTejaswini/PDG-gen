
import java.util.*;

public class Main {
  static int cnt;
  static List<Integer> g;

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      cnt = 0;
      shellSort(arr);

      StringBuilder sb = new StringBuilder();
      sb.append(g.size() + "\n");
      for (int i = g.size() - 1; i >= 0; i--) {
        sb.append(g.get(i));
        if (i != 0) sb.append(' ');
      }
      sb.append("\n" + cnt + "\n");
      for (int i = 0; i < n; i++) {
        sb.append(arr[i] + "\n");
      }
      System.out.println(sb.toString());
    }
  }

  static void shellSort(int[] arr) {
    // generate g g+1 = 3gn+1
    g = new ArrayList<>();
    for (int i = 1; i <= arr.length; i = 3 * i + 1) {
      g.add(i);
    }

    for (int i = g.size() - 1; i >= 0; i--) {
      insertionSort(arr, g.get(i));
    }
  }

  static void insertionSort(int[] arr, int g) {
    for (int i = g; i < arr.length; i++) {
      int tmp = arr[i];
      int j = i - g;

      while (j >= 0 && arr[j] > tmp) {
        arr[j + g] = arr[j];
        j -= g;
        cnt++;
      }
      arr[j + g] = tmp;
    }
  }
}

