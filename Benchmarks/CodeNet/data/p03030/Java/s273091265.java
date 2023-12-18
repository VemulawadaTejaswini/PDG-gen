import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Map<Integer, Integer>> scoreMap = new TreeMap<String, Map<Integer, Integer>>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int p = sc.nextInt();
            if (scoreMap.containsKey(s)) {
                scoreMap.get(s).put(p, i + 1);
            } else {
                // scoreの降順に格納するmap
                Map<Integer, Integer> shopMap = new TreeMap<Integer, Integer>(new Comparator<Integer>() {
                    public int compare(Integer k1, Integer k2) {
                        return k2.compareTo(k1);
                    }
                });
                shopMap.put(p, i + 1);
                scoreMap.put(s, shopMap);
            }
        }
        sc.close();

        for (String key : scoreMap.keySet()) {
            Map<Integer, Integer> map = scoreMap.get(key);
            for (Integer score : map.keySet()) {
                System.out.println(map.get(score));
            }
        }
    }
}
