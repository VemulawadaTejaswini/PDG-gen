
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int x = sc.nextInt();

    // テーブルを作成
    int[] cList = new int[n];
    int[][] aLists = new int[n][m];
    for (int i = 0; i < n; i++) {
      cList[i] = sc.nextInt();
      for (int j = 0; j < m; j++) {
        aLists[i][j] = sc.nextInt();
      }
    }

    List<Long> amountList = new ArrayList<>();
    for (int k = 0; k < m; k++) {
      List<Long> amountListBuffer = new ArrayList<>();
      for (int i = 0; i < (Math.pow(2, n)); i++) {
        int sum = 0;
        long amount = 0L;
        for (int j = 0; j < n; j++) {
          if ((1 & i >> j) == 1) {
            sum += aLists[j][k];
            amount += cList[j];
          }
        }
        if (k == 0 && sum >= x) {
          amountList.add(amount);
        } else if (sum >= x) {
          amountListBuffer.add(amount);
        }
      }

      if (k != 0) {
        amountList =
            amountList.stream().filter(amountListBuffer::contains).collect(Collectors.toList());
      }
    }

    if (amountList.size() == 0) {
      System.out.println(-1);
    } else {
      System.out.println(amountList.stream().mapToLong(i -> i).min().getAsLong());
    }
  }
}
