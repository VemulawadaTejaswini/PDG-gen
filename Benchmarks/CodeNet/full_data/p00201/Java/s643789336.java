import java.io.*;
import java.util.*;

public class Main {
  // constant

  // global variables

  static HashMap<String, Integer> prices;
  static HashMap<String, ArrayList<String>> recipes;
  static HashMap<String, Integer> mccache;

  // subroutines

  static int min_cost(String item) {
    if (mccache.containsKey(item)) return mccache.get(item).intValue();

    ArrayList<String> rcp = recipes.get(item);
    if (rcp == null) {
      Integer pri = prices.get(item);
      mccache.put(item, pri);
      return pri.intValue();
    }

    int sum = 0;
    for (String item0: rcp) sum += min_cost(item0);

    Integer pri = prices.get(item);
    mccache.put(item, pri);

    int pr = pri.intValue();
    return (pr < sum) ? pr : sum;
  }

  // main
  public static final void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      int n = Integer.parseInt(br.readLine().trim());
      if (n == 0) break;

      prices = new HashMap<String, Integer>();

      for (int id = 0; id < n; id++) {
        String[] items = br.readLine().trim().split(" ");
        prices.put(items[0], new Integer(items[1]));
      }

      recipes = new HashMap<String, ArrayList<String>>();

      int m = Integer.parseInt(br.readLine().trim());

      for (int i = 0; i < m; i++) {
        String[] items = br.readLine().trim().split(" ");

        String id = items[0];
        int k = Integer.parseInt(items[1]);

        ArrayList<String> rcpi = new ArrayList<String>();
        recipes.put(id, rcpi);
        for (int j = 0; j < k; j++)
          rcpi.add(items[j + 2]);
      }

      String target = br.readLine().trim();

      mccache = new HashMap<String, Integer>();

      int mc = min_cost(target);
      System.out.println(mc);
    }
  }
}