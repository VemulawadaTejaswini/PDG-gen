import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        String id = "00000";
        Map<Long,Integer> map = new TreeMap<>();
        for (int i = 0; i < m; i++) {
            int p = scan.nextInt();
            long y = scan.nextLong();
            map.put(y, p);
        }
        int[] n_cnt = new int[n];
        for(Entry<Long, Integer> entry : map.entrySet()){
            int p = map.get(entry.getKey());
            n_cnt[p-1]++;
            System.out.println(id + p + id + n_cnt[p-1]);
        }
    }
}
