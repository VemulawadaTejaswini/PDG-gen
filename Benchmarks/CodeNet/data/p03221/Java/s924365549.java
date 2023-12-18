import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    Map<Integer, Integer> ypMap = new TreeMap<Integer, Integer>();
    List<Integer> yList = new ArrayList<Integer>();
    for (int i = 0; i < M; i++) {
      Integer p = sc.nextInt();
      Integer y = sc.nextInt();
      ypMap.put(y, p);
      yList.add(y);
    }
    sc.close();

    Map<Integer, Integer> pCntMap = new HashMap<Integer, Integer>();
    Map<Integer, String> yNumMap = new HashMap<Integer, String>();
    for (Map.Entry<Integer, Integer> entry : ypMap.entrySet()) {
      int p = entry.getValue();
      int cnt = pCntMap.getOrDefault(p, 1);
      yNumMap.put(entry.getKey(), getLast6Strings("00000" + String.valueOf(p))
          + getLast6Strings("00000" + String.valueOf(cnt)));
      pCntMap.put(p, ++cnt);
    }

    for (Integer integer : yList) {
      System.out.println(yNumMap.get(integer));
    }
  }

  private static String getLast6Strings(String str) {
    return str.substring(str.length() - 6);
  }
}
