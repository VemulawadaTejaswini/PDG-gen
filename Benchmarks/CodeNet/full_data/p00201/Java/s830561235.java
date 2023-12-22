
import java.util.*;

class Main {

    Scanner sc;
    HashMap<String, Integer> itemList;
    HashMap<String, LinkedList<String>> itemComb;

    long solve(String item, long min) {
        long sum = 0;
        if ( !itemList.containsKey(item) )return min;
        if ( !itemComb.containsKey(item) )return min;
        if (itemComb.get(item).isEmpty()) {
            return itemList.get(item);
        }
        for (String str : itemComb.get(item)) {
            sum += solve(str, itemList.get(str));
            if (sum >= min) return min;
        }
        return sum;
    }

    void run() {
        sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            itemList = new HashMap<String, Integer>();
            itemComb = new HashMap<String,LinkedList<String>>();
            for (int i = 0; i < n; i++) {
                LinkedList<String> tmp = new LinkedList<String>();
                String item = sc.next();
                itemList.put(item, sc.nextInt());
                itemComb.put(item,tmp);
            }
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                String item = sc.next();
                int num = sc.nextInt();
                LinkedList<String> tmp = new LinkedList<String>();
                for (int j = 0; j < num; j++) {
                    tmp.add(sc.next());
                }
                itemComb.put(item,tmp);
            }
            String q = sc.next();
            System.out.println(solve( q, itemList.get(q) ) );
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}