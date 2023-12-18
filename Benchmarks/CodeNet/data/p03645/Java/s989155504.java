import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int a[][] = new int[m][2];
        for (int i = 0; i < m; i++) {
            a[i][0] = Integer.parseInt(sc.next());
            a[i][1] = Integer.parseInt(sc.next());
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