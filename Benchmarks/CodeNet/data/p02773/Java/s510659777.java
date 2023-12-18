import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int maxOc = 0;
        HashMap<String, Integer> occs = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            int current = 1;
            if (occs.containsKey(word))
                current = occs.get(word) + 1;
            maxOc = Math.max(current, maxOc);
            occs.put(word, current);
        }

        Iterator it = occs.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry mp = (Map.Entry) it.next();
            int val = (int) mp.getValue();
            if (val == maxOc)
                System.out.println(mp.getKey());
        }

    }
}
