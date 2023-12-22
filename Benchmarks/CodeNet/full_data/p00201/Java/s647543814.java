import java.util.*;

public class Main {
  // global variables

  static HashMap<String, Integer> prices;
  static HashMap<String, ArrayList<String>> recipes;

  // subroutines

  static int min_cost(String item0) {
    Stack<String> stack = new Stack<String>();
    HashMap<String, Integer> mccache = new HashMap<String, Integer>();

    stack.add(item0);

    while (! stack.empty()) {
      String item = stack.peek();

      if (mccache.containsKey(item)) {
        stack.pop();
        continue;
      }

      ArrayList<String> rcp = recipes.get(item);
      if (rcp == null) {
        Integer pri = prices.get(item);
        mccache.put(item, pri);
        stack.pop();
        continue;
      }

      boolean need_rec = false;
      ArrayList<Integer> rtmp = new ArrayList<Integer>();

      for (String item1: rcp) {
        Integer mci = mccache.get(item1);
        if (mci == null) {
          if (stack.search(item1) < 0) {
            stack.push(item1);
            need_rec = true;
          }
          else
            rtmp.add(prices.get(item1));
        }
        else
          rtmp.add(mccache.get(item1));
      }

      if (need_rec) continue;

      int sum = 0;
      for (int pr0: rtmp) sum += pr0;

      int pr = prices.get(item);
      mccache.put(item, (pr < sum) ? pr : sum);
      stack.pop();
    }

    return mccache.get(item0);
  }

  // main
  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    for (;;) {
      int n = sc.nextInt();
      if (n == 0) break;

      prices = new HashMap<String, Integer>();

      for (int id = 0; id < n; id++) {
        String item = sc.next();
        int price = sc.nextInt();
        prices.put(item, price);
        //System.out.println(item + " = " + price);
      }

      recipes = new HashMap<String, ArrayList<String>>();

      int m = sc.nextInt();

      for (int i = 0; i < m; i++) {
        String item = sc.next();
        int k = sc.nextInt();
        //System.out.print(item + "(" + k + "):");

        ArrayList<String> rcpi = new ArrayList<String>();
        recipes.put(item, rcpi);
        for (int j = 0; j < k; j++) {
          String item1 = sc.next();
          rcpi.add(item1);
          //System.out.print(" " + item1);
        }
        //System.out.println("");
      }

      String target = sc.next();

      int mc = min_cost(target);
      System.out.println(mc);
    }
  }
}