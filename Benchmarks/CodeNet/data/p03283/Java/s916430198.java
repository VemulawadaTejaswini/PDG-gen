import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i < M; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            List<Integer> list = map.getOrDefault(l, new ArrayList<>());
            list.add(r);
            map.put(l,list);
        }
        for (List<Integer> list : map.values()) Collections.sort(list);
        for (int i = 0; i < Q; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int ans = 0;
            for (List<Integer> list : map.subMap(p, true, q, true).values()) {
                int pos = Collections.binarySearch(list, q);
                ans += pos >= 0 ? pos + 1 : (-pos - 1);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}