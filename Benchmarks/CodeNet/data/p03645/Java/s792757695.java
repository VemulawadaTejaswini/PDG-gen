import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int a[][] = new int[m][2];
        for (int i = 0; i < m; i++) {
            int x = Integer.parseInt(sc.next());
            int y = Integer.parseInt(sc.next());
            if (x == 1 || y == n) {
                a[i][0] = x;
                a[i][1] = y;
            }
        }
        sc.close();
        Queue<Integer> que = new ArrayDeque<>();
        int s[] = new int[n + 1];
        que.add(1);
        s[1] = 0;
        while (!que.isEmpty()) {
            int x = que.poll();
            int c = s[x];
            if (c >= 2)
                continue;
            for (int i = 0; i < m; i++) {
                if (a[i][0] != x)
                    continue;
                if (s[a[i][1]] == 0) {
                    s[a[i][1]] = c + 1;
                    que.add(a[i][1]);
                }
            }
        }
        if (s[n] == 2) {
            System.out.println("POSSIBLE");
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}