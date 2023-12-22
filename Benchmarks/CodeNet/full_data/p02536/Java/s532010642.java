import java.util.*;

public class Main {
    
    static Map<Integer, Boolean> map;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Set<Integer>> way = new ArrayList<>();
        for (int i = 0; i < N+1; i++) {
            way.add(new HashSet<>());
        }
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            way.get(A).add(B);
            way.get(B).add(A);
        }
        long count = 0;
        map = new HashMap<>();
        map.put(0,true);
        for (int i = 1; i < N+1; i++) {
            map.put(i, false);
        }
        for (int i = 1; i < N+1; i++) {
            Set<Integer> set = way.get(i);
            if (map.get(i)) {
                continue;
            } else {
                map.put(i, true);
                calc(set);
                if (map.containsValue(false)) {
                    count++;
                } else {
                    System.out.println(count);
                    return;
                }
            }
        }
        for (Integer i : map.keySet()) {
            if (!map.get(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
    
    private static void calc(Set<Integer> set) {
        for (Integer i : set) {
            map.put(i, true);
        }
    }
}