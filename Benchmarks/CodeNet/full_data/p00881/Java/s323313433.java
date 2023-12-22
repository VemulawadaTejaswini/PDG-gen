import java.util.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int n = sc.nextInt();
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
            for(int i=0;i<m;i++){
                int ko=0;
                for(int j=0;j<n;j++){
                    if(dset[j][i])ko+=1;
                }
                System.out.print(ko + " ");
            }
        }
    }

    private static int solve(int m, int n, boolean[][] dset) {
        Queue<boolean[]> que = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        boolean[] select = new boolean[m];
        Arrays.fill(select, true);
        que.add(select);
        set.add(getkey(select));
        int min = m + 0;
        boolean[] before = {};
        boolean[] test = {false,false,true,false,true,false,false,false,true,true,false};
        check(m, n, dset, test);

        while (!que.isEmpty()) {
            before = que.remove();
            for (int i = 0; i < m; i++) {
                boolean[] after = before.clone();
                if (!after[i]) continue;
                after[i] = false;
                int key = getkey(after);
                if (!set.contains(key) && check(m, n, dset, after)) {
                    que.add(after);
                    set.add(key);
                    int c = count(after);
                    if (c < min) min = c;
                }
            }
        }
        return min;
    }

    private static boolean check(int m, int n, boolean[][] dset, boolean[] after) {
        Set<Integer> set = new HashSet<>();
        for (boolean[] data : dset) {
            int k = 1, key = 0;
            for (int i = 0; i < m; i++) {
                if (after[i]) {
                    if (data[i]) key += k;
                    k *= 2;
                }
            }
            if (set.contains(key)) return false;
            set.add(key);
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
            if (a[i]) key += k;
            k *= 2;
        }
        return key;
    }


}

