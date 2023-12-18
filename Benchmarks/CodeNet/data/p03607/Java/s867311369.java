import java.util.HashMap;
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
                an.put(k, Integer.parseInt(an.get(k).toString()) == 1 ? 0 : 1);
            } else {
                an.put(k, 1);
            }
        }

        int c = 0;
        for (Entry<Integer, Integer> e : an.entrySet()) {
            if (e.getValue() == 1) {
                c += 1;
            }
        }

        System.out.println(c);
    }

}