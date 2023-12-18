import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int n = in.nextInt(), m = in.nextInt();
        HashMap<Integer, Integer> pos = new HashMap<>();

        HashMap<Integer, List<int[]>> hm = new HashMap<>();
        for (int i = 0 ; i < m; i++) {
            int l = in.nextInt() - 1, r = in.nextInt() - 1, d = in.nextInt();
            List<int[]> list = hm.getOrDefault(l, new ArrayList<>());
            list.add(new int[]{l, r, d});
            hm.put(l, list);
            List<int[]> list2 = hm.getOrDefault(r, new ArrayList<>());
            list2.add(new int[]{l, r, d});
            hm.put(r, list2);
        }
        boolean set = true;
        while (hm.size() > 0) {
            boolean update = false;
            List<Integer> toremove = new ArrayList<>();
            for (int j : hm.keySet()) {
                if (set) {
                    pos.put(j, 0);
                    set = false;
                }

                if (!pos.containsKey(j))
                    continue;
                for (int[] aaa : hm.get(j)) {
                    int l = aaa[0], r = aaa[1], d = aaa[2];
                    if (!pos.containsKey(l)) {
                        pos.put(l, pos.get(r) - d);
                    } else if (!pos.containsKey(r)) {
                        pos.put(r, pos.get(l) + d);
                    } else {
                        if (!pos.get(r).equals(pos.get(l) + d)) {
                            System.out.println("No");
                            return;
                        }
                    }
                }
                update = true;
                toremove.add(j);
            }
            for (int j : toremove)
                hm.remove(j);
            if (hm.size() != 0 && !update) {
                set = true;
            }
        }
        System.out.println("Yes");
    }
}