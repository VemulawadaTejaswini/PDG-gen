import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        Map<Character, List<Integer>> map = new HashMap<>();
        {
            int i = 0;
            for (char c : s.toCharArray()) {
                List<Integer> l = map.getOrDefault(c, new ArrayList<>());
                l.add(i);
                map.put(c, l);
                i++;
            }
        }

        int prev = -1;
        int res = 0;
        int i = -1;
        for (char c : t.toCharArray()) {
            List<Integer> list = map.get(c);
            if (list == null) {
                System.out.println("-1");
                return;
            }

            for (int index : list) {
                if (prev < index) {
                    i = index;
                    break;
                }
            }
            if (i == prev) {
                i = list.get(0);
                res++;
            }
            prev = i;
        }
        System.out.println(s.length() * res + i + 1);
    }
}
