import java.util.*;

public class Main {
  public static void main(final String[] args) {
    @SuppressWarnings("resource")
    final Scanner sc = new Scanner(System.in);
    final int n = sc.nextInt();
    final int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    final int cnt = selectionSort(arr);
    trace(arr);
    System.out.println(cnt);
  }

  static int selectionSort(final int[] arr) {
    int cnt = 0, minIdx;
    for (int i = 0; i < arr.length - 1; i++) {
      minIdx = i;
      // 未ソートの部分から最小の要素の位置を特定して
      for (int j = i; j < arr.length; j++) {
        if (arr[j] < arr[minIdx]) minIdx = j;
      }
      // 交換する
      if(i != minIdx) {
        int tmp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = tmp;
        cnt++;
      }
    }
    return cnt;
  }

  static void trace(final int[] arr) {
    final StringBuilder sb = new StringBuilder();
    for (final int num : arr) {
      sb.append(num).append(' ');
    }
    System.out.println(sb.toString().trim());
  }
}

