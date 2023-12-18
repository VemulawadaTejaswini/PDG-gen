import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int n = in.nextInt(), m = in.nextInt();
        int[] pos = new int[n];
        Arrays.fill(pos, Integer.MAX_VALUE);
        List<int[]> todo = new ArrayList<>();
        for (int i = 0 ; i < m; i++) {
            int l = in.nextInt() - 1, r = in.nextInt() - 1, d = in.nextInt();
            todo.add(new int[]{l, r, d});
        }
        todo.sort((a, b) -> a[0] - b[0]);
        while (todo.size() > 0) {
            boolean set = false;
            for (int i = 0; i < todo.size(); i++) {
                int[] aaa = todo.get(i);
                int l = aaa[0], r = aaa[1], d = aaa[2];
                if (pos[l] == Integer.MAX_VALUE && pos[r] == Integer.MAX_VALUE && !set) {
                    pos[aaa[0]] = 0;
                    pos[aaa[1]] = aaa[2];
                    set = true;
                } else if (pos[l] == Integer.MAX_VALUE && pos[r] == Integer.MAX_VALUE) {
                    continue;
                } else if (pos[l] == Integer.MAX_VALUE) {
                    pos[l] = pos[r] - d;
                } else if (pos[r] == Integer.MAX_VALUE) {
                    pos[r] = pos[l] + d;
                } else {
                    if (pos[r] != pos[l] + d) {
                        System.out.println("No");
                        return;
                    }
                }
                todo.remove(i);
                i--;
            }
        }
        System.out.println("Yes");
    }
}