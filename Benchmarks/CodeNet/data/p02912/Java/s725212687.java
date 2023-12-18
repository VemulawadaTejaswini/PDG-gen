import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
//        int[] A = new int[N];
        NavigableMap<Integer, Integer> ns = new TreeMap<>();

        for(int i = 0; i < N; i ++) {
            Integer a = scanner.nextInt();
            if(ns.containsKey(a)) {
                ns.put(a, ns.get(a) + 1);
            }else {
                ns.put(a, 1);
            }
        }

        for(int i = 0; i < M; i++) {
            Integer key = ns.lowerKey(Integer.MAX_VALUE);
            Integer val = ns.get(key);
            if(val == 1) {
                ns.remove(key);
            }else{
                ns.put(key, val - 1);
            }

            Integer newKey = key / 2;
            if(ns.containsKey(newKey)) {
                ns.put(newKey, ns.get(newKey) + 1);
            }else {
                ns.put(newKey, 1);
            }
        }

        long sum = 0;
        for (Integer key : ns.keySet()) {
            Integer val = ns.get(key);
            sum += (long)key * (long)val;
        }
        System.out.println(sum);
    }
}
