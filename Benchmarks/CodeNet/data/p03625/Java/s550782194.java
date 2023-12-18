import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> an = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            if (an.containsKey(k)) {
                an.put(k, Integer.parseInt(an.get(k).toString())+1);
            } else {
                an.put(k, 1);
            }
        }

        List<Integer> l = new ArrayList<Integer>();
        for (Entry<Integer, Integer> e : an.entrySet()) {
            if (e.getValue() >= 2) {
                l.add(e.getKey());
            }
        }
        Collections.sort(l);

        int s = l.size();
        if (s < 2) {
            System.out.println(0);
            System.exit(0);
        }
        System.out.println(l.get(s-2) * l.get(s-1));
    }

}