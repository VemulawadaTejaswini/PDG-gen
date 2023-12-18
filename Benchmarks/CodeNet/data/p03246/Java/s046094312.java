import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    Map<Integer, Integer> mMap = new HashMap<>();
    for (int i = 0; i < N; i++) {
      int v = Integer.parseInt(sc.next());
      mMap.merge(v, 1, Integer::sum);
    }

    if (mMap.size() == 1) {
      System.out.println(N / 2);
      return;
    }

    List<Entry<Integer, Integer>> list_entries = new ArrayList<Entry<Integer, Integer>>(mMap.entrySet());

    Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>() {
      //compareを使用して値を比較する
      public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
        //降順
        return obj2.getValue().compareTo(obj1.getValue());
      }
    });

    int ans = N - list_entries.get(0).getValue() - list_entries.get(1).getValue();
    System.out.println(ans);
  }
}