import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int s[][] = new int[h + 2][w + 2];
        Queue<Pair> que = new ArrayDeque<>();
        for (int i = 0; i < h; i++) {
            char c[] = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                if (c[j] == '.') {
                    s[i + 1][j + 1] = -1;
                } else if (c[j] == '#') {
                    que.add(new Pair(i + 1, j + 1));
                }

            }
        }
        sc.close();

        Pair p;
        int ans = 0;
        while (!que.isEmpty()) {
            p = que.poll();
            ans = s[p.x][p.y];
            if (s[p.x + 1][p.y] == -1) {
                s[p.x + 1][p.y] = ans + 1;
                que.add(new Pair(p.x + 1, p.y));
            }
            if (s[p.x - 1][p.y] == -1) {
                s[p.x - 1][p.y] = ans + 1;
                que.add(new Pair(p.x - 1, p.y));
            }
            if (s[p.x][p.y + 1] == -1) {
                s[p.x][p.y + 1] = ans + 1;
                que.add(new Pair(p.x, p.y + 1));
            }
            if (s[p.x][p.y - 1] == -1) {
                s[p.x][p.y - 1] = ans + 1;
                que.add(new Pair(p.x, p.y - 1));
            }
        }
        System.out.println(ans);
    }
}

class Pair {
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}