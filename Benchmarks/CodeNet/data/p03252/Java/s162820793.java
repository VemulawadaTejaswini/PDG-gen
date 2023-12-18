import java.util.*;

/**
 * Copyright © 2018 Chris. All rights reserved.
 *
 * @author Chris
 * 2018/7/5 22:51
 */
public class Main {
    
    @SuppressWarnings("unchecked")
    private static void solve(Scanner sc) {
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        int n = s.length;

        Set<Integer>[] idx = new Set[128];
        for (int i = 'a'; i <= 'z'; i++) {
            idx[i] = new HashSet<>();
        }
        for (int i = 0; i < n; i++) {
            idx[s[i]].add(i);
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) {

            if (s[i] == t[i]) {
                set.add(t[i]);
                continue;
            }
            if (set.contains(s[i]) || set.contains(t[i])) {
                System.out.println("No");
                return;
            }
            set.add(t[i]);
            char cs = s[i];
            Iterator<Integer> it = idx[cs].iterator();
            List<Integer> ls = new ArrayList<>();
            while (it.hasNext()) {
                int index = it.next();
                s[index] = t[i];
                it.remove();
                ls.add(index);
            }

            it = idx[t[i]].iterator();
            List<Integer> lt = new ArrayList<>();
            while (it.hasNext()) {
                int index = it.next();
                s[index] = cs;
                it.remove();
                lt.add(index);
            }
            for (int k : ls) {
                idx[t[i]].add(k);
            }
            for (int k : lt) {
                idx[cs].add(k);
            }
        }

        System.out.println("Yes");
    }

    public static void main(String args[]) {

        solve(new Scanner(System.in));
    }
}
