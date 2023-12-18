
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner scanner = new Scanner(System.in);
    int ballNum = scanner.nextInt();
    int ballTypeCount = scanner.nextInt();

    Map<Integer, Integer> bMap = new HashMap<Integer, Integer>();

    for (int i = 0; i < ballNum; i++) {
      int num = scanner.nextInt();
      Integer o = bMap.get(num);
      if (o != null) {
        o++;
      } else {
        o = 1;
      }
      bMap.put(num, o);
    }

    int writeCount = 0;

    // 3種類のボール
    while (bMap.size() > ballTypeCount) {
      // 最小のバリュー値のエントリーを取りだす。
      // そのバリュー値分のwriteCountを増分する
      // そのエントリーを削除する

      Integer minKey = null;
      Integer minValue = null;

      for (Integer i : bMap.keySet()) {
        if (minKey == null) {
          minKey = i;
          minValue = bMap.get(i);
        } else {
          if(minValue > bMap.get(i)) {
            minKey = i;
            minValue = bMap.get(i);
          }
        }
      }

      writeCount = writeCount + minValue;
      bMap.remove(minKey);

    }

    System.out.println(writeCount);


  }

}
