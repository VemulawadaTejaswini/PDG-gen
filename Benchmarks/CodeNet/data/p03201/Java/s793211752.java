import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TreeMap<Long, Long> tm = new TreeMap<Long, Long>();
        for (int i = 0; i < n; i++) {
            long tmp = sc.nextLong();
            tm.put(tmp, tmp);
        }

        int count = 0;
        while (!tm.isEmpty()) {
            long req = 0;
            for (int j = 0; j < 33; j++) {
                if (Math.pow(2, j) > tm.lastKey()) {
                    req = (long)Math.pow(2, j) - tm.lastKey();
                    break;
                }
            }
            tm.remove(tm.lastKey());
            if (tm.containsKey(req)) {
                tm.remove(req);
                count++;
            }
        }
        System.out.println(count);
    }
}
