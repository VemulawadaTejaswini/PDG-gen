import java.util.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();//横
            int n = sc.nextInt();//縦
            if (m == 0 && n == 0) break;
            boolean[][] dset = new boolean[n][m];
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                for (int j = 0; j < m; j++) {
                    if (s.charAt(j) == '1')
                        dset[i][j] = true;
                    else dset[i][j] = false;
                }
            }
            System.out.println(solve(m, n, dset));
        }
    }

    private static int solve(int m, int n, boolean[][] dset) {
        Queue<boolean[]> que = new ArrayDeque<>();
        List<Integer> li = new ArrayList<>();
        boolean[] select = new boolean[m];
        Arrays.fill(select, true);
        que.add(select);
        li.add(getkey(select));
        boolean[] before = {};
        while (!que.isEmpty()) {
            before = que.remove();
            for (int i = 0; i < m; i++) {
                boolean[] after = before.clone();
                if (after[i] == false) continue;
                after[i] = false;
                int key = getkey(after);
                if (li.contains(key) == false && check(m, n, dset, after) == true) {
                    que.add(after);
                    li.add(key);
                }
            }
        }
        return count(before);
    }

    private static boolean check(int m, int n, boolean[][] dset, boolean[] after) {
        List<Integer> li_c = new ArrayList<>();
        for (boolean[] data : dset) {
            int k = 1, key = 0;
            for (int i = 0; i < m; i++) {
                if (after[i] == true) {
                    if (data[i] == true) key += k;
                    k *= 10;
                }
            }
            if (li_c.contains(key)) return false;
            li_c.add(key);
        }
        return true;
    }

    private static int count(boolean[] before) {
        int count = 0;
        for (boolean b : before) {
            if (b) count++;
        }
        return count;
    }

    private static int getkey(boolean[] a) {
        int key = 0, k = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == true) key += k;
            k *= 10;
        }
        return key;
    }


}

