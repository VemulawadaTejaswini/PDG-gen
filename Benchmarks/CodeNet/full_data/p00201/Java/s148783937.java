
import java.util.*;

class Main {

    Scanner sc;
    HashMap<Integer, Integer> itemList;
    HashMap<String, Integer> key;
    LinkedList<Integer>[] itemComb;

    long solve(int item) {
        long sum = 0;
        if (itemComb[item].isEmpty()) {
            return itemList.get(item);
        }
        for (int str : itemComb[item]) {
            sum += solve(str);
        }
        return Math.min(itemList.get(item), sum);
    }

    void run() {
        sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            itemList = new HashMap<Integer, Integer>();
            key = new HashMap<String, Integer>();
            itemComb = new LinkedList[n];
            for (int i = 0; i < n; i++) {
                String item = sc.next();
                itemList.put(i, sc.nextInt());
                key.put(item, i);
                itemComb[i] = new LinkedList<Integer>();
            }
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                String item = sc.next();
                int num = sc.nextInt();
                for (int j = 0; j < num; j++) {
                    itemComb[key.get(item)].add( key.get(sc.next()) );
                }
            }
            System.out.println(solve( key.get(sc.next()) ) );
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}