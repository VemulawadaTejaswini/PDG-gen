package c;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by numajiri on 17/02/11.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer>[] edge = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            edge[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int tmpN = sc.nextInt();
            int tmpM = sc.nextInt();
            sc.nextLine();
            edge[tmpN-1].add(tmpM);
            edge[tmpM-1].add(tmpN);
        }
        int total = 0;
        Queue<path> queue = new LinkedList<>();
        for (Integer tmp : edge[0]) {
            boolean[] flags = new boolean[n];
            flags[0] = true;
            flags[tmp-1] = true;
            queue.add(new path(flags, tmp));
        }
        while (!queue.isEmpty()) {
            path p = queue.poll();
            for (Integer mm : edge[p.current - 1]) {
                boolean[] flags = Arrays.copyOf(p.flags, n);
                if (flags[mm-1])
                    continue;
                flags[mm-1] = true;
                boolean allFlag = true;
                for (boolean bb : flags) {
                    allFlag &= bb;
                }
                if (allFlag) {
                    total++;
                }
                else {
                    queue.add(new path(flags, mm));
                }
            }
        }
        System.out.println(total);
    }

}

class path {
    boolean[] flags;
    int current;
    boolean all = false;

    public path(boolean[] flags, int current) {
        this.flags = Arrays.copyOf(flags, flags.length);
        this.current = current;
    }
}
