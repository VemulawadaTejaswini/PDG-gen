import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[n];
        int[] p = new int[n];
        Map<String, Map<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            s[i] = scanner.next();
            p[i] = scanner.nextInt();
            Map<Integer, Integer> map2 = map.getOrDefault(s[i], new HashMap<>());
            map2.put(p[i], i+1);
            map.put(s[i], map2);
        }
        Arrays.sort(s);
        Set<String> done = new HashSet<>();
        for (String str : s) {
            if (done.contains(str)) {
                continue;
            }
            Map<Integer, Integer> m = map.get(str);
            List<Integer> scoreL = new ArrayList<>(m.keySet());
            scoreL.sort(Collections.reverseOrder());
            for (Integer score : scoreL) {
                System.out.println(m.get(score));
            }
            done.add(str);
        }
    }
}