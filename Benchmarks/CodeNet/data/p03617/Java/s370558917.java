import java.io.*;
import java.util.*;
import java.math.*;
public class Main {
  public static void main(String[] args) throws Exception {
    String line = null;
    double num = 0;
    double rem = 0;
    double res = 0;
    double[] size = {0.25, 0.5, 1, 2};
    double[][] array = new double[4][3];
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    line = br.readLine();
    String price[] = line.split(" ");
    line = br.readLine();
    double vol = Double.parseDouble(line);
    // 配列に1リットルあたりの単価を登録
    array[0][0] = Double.parseDouble(price[0]) * 4;         // 0.25L
    array[1][0] = Double.parseDouble(price[1]) * 2;         // 0.50L
    array[2][0] = Double.parseDouble(price[2]);             // 1.00L
    array[3][0] = (double)Double.parseDouble(price[3]) / 2; // 2.00L
    // 配列にサイズを登録
    for (int i = 0; i < 4; i++) {
      array[i][1] = size[i];
    }
    // 配列に価格を登録
    for (int i = 0; i < 4; i++) {
      array[i][2] = Double.parseDouble(price[i]);
    }
    Arrays.sort(array, new Comparator<double[]>() {
      @Override
      public int compare(double[] o1, double[] o2) {
        if (o1[0] == o2[0]) {
          //サイズでソート(降順)
          if (o2[1] < o1[1]) return -1;
          if (o2[1] > o1[1]) return 1;
          return 0;
        } else {
          //単価でソート(昇順)
          if (o1[0] < o2[0]) return -1;
          if (o1[0] > o2[0]) return 1;
          return 0;
        }
      }
    });
    for (int i = 0; i < 4; i++) {
      if (array[i][1] > vol) {   // サイズが大きかったら買わない
        continue;
      }
      num = vol / array[i][1];   // 買える数
      num = Math.floor(num);     // 小数点以下切り捨て
      rem = vol - num * array[i][1];   // 買えない数
      res = res + num * array[i][2];
      if (rem == 0) {
        break;
      }
      vol = rem;
    }
    System.out.println((long)res);
  }
}