import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        Map<Character, List<Integer>> si = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            List<Integer> list = si.get(c);
            if (list == null) {
                list = new ArrayList<>();
                si.put(c,list);
            }
            list.add(i+1);
        }

        boolean found = true;
        int unit = 0;
        long ans = 0;
        int now = 0;
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!si.containsKey(c)) {
                found = false;
                break;
            }
            List<Integer> list = si.get(c);
            if (list.get(list.size()-1) <= now) {
                unit++;
                now = list.get(0);
            } else {
                now = find(list, now+1);
            }
            ans = (long)unit*s.length()+now;
        }

        System.out.println(found ? ans : -1);
    }

    private static int find(List<Integer> list, int key) {

        int ng = -1;
        int ok = list.size()-1;

        while (ng+1 < ok) {
            int mid = (ok+ng)/2;
            if (list.get(mid) >= key) {
                ok = mid;
            } else {
                ng = mid;
            }
        }

        return list.get(ok);
    }
}
