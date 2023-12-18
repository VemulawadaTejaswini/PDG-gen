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
        boolean[][] edge = new boolean[n][n];
        for (int i = 0; i < m; i++) {
            int tmpN = sc.nextInt();
            int tmpM = sc.nextInt();
            sc.nextLine();
            edge[tmpN-1][tmpM-1] = true;
            edge[tmpM-1][tmpN-1] = true;
        }
        int total = 0;
        Queue<path> queue = new LinkedList<>();
        int num = 0;
        for (boolean tmp : edge[0]) {
            num++;
            boolean[] flags = new boolean[n];
            flags[0] = true;
            if (tmp) {
                flags[num - 1] = true;
                queue.add(new path(flags, num));
            }
        }
        while (!queue.isEmpty()) {
            path p = queue.poll();
            num = 0;
            for (boolean tmp : edge[p.current - 1]) {
                num++;
                boolean[] flags = Arrays.copyOf(p.flags, n);
                if (!tmp)
                    continue;
                if (flags[num-1])
                    continue;
                flags[num-1] = true;
                boolean allFlag = true;
                for (boolean bb : flags) {
                    allFlag &= bb;
                }
                if (allFlag) {
                    total++;
                }
                else {
                    queue.add(new path(flags, num));
                }
            }
        }
        System.out.println(total);
    }

}

class path {
    boolean[] flags;
    int current;

    public path(boolean[] flags, int current) {
        this.flags = Arrays.copyOf(flags, flags.length);
        this.current = current;
    }
}
