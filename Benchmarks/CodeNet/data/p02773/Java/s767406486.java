import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s[] = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Map<String, Integer> hm = new HashMap<>();
        for (String string : s) {
            if (hm.containsKey(string)) {
                hm.put(string, hm.get(string) + 1);
            } else {
                hm.put(string, 1);
            }
        }
        int max = 0;
        for (Integer v : hm.values()) {
            if (max < v)
                max = v;
        }
        final int fmax = max;
        List<String> t = hm.entrySet().stream().filter(e -> e.getValue() == fmax).map(e -> e.getKey()).sorted()
                .collect(Collectors.toList());
        for (String w : t) {
            System.out.println(w);
        }
    }
}