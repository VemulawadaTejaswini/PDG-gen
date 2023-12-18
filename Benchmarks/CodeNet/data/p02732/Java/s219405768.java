import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        FreqMap map = new FreqMap();
        String[] arrstr = scn.nextLine().split(" ");
        long[] array = new long[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(arrstr[i]);
            map.add(array[i]);
        }
        long ans = 0;
        for (long num : map.map.values()) {
            ans += num * (num - 1) / 2;
        }

        for (int i = 0; i < n; i++) {
            long num = map.getCount(array[i]);
            long finalans = ans - (num * (num - 1) / 2) + ((num - 1) * (num - 2) / 2);
            System.out.println(finalans);
        }

    }

}

class FreqMap {
    HashMap<Long, Long> map;

    FreqMap() {
        map = new HashMap<>();
    }

    public void add(long n) {
        if (map.containsKey(n)) {
            map.put(n, map.get(n) + 1);
        } else {
            map.put(n, 1L);
        }
    }

    public long getCount(long n) {
        return map.get(n);
    }
}