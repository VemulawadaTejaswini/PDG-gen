import java.util.*;

class Main {
    static Scanner sc;
    static int n, m;
    static ArrayList<Integer>[] adj;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<Integer>();
        }

        TreeSet<Pair> set = new TreeSet<Pair>();
        for (int i = 0; i < m; i++) {
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            x--;
            y--;
            if (x > y) {
                int tmp = x;
                x = y;
                y = tmp;
            }
            set.add(new Pair(x, y));
        }

        for (Pair p: set) {
            adj[p.x].add(p.y);
            adj[p.y].add(p.x);
        }

        int ans = solve();
        System.out.println(ans);
    }

    public static int solve() {
        Stack<Integer> stack = new Stack<Integer>();
        Boolean[] used = new Boolean[n];
        for (int i = 0; i < n; i++) {
            used[i] = false;
        }
        int maxSize = 0;
        for (int i = 0; i < n; i++) {
            if (used[i]) {
                continue;
            }
            stack.add(i);
            int size = 0;
            while (stack.size() > 0) {
                int crt = stack.pop();
                if (used[crt]) {
                    continue;
                }
                used[crt] = true;
                size++;
                for (int nxt: adj[crt]) {
                    if (used[nxt]) {
                        continue;
                    }
                    stack.add(nxt);
                }
            }
            if (size > maxSize) {
                maxSize = size;
            }
        }
        return maxSize;
    }
}

class Pair implements Comparable<Pair> {
    int x, y;

    Pair(int _x, int _y) {
        x = _x;
        y = _y;
    }

    public int compareTo(Pair b) {
        if (x > b.x) {
            return 1;
        } else if (x < b.x) {
            return -1;
        }

        if (y > b.y) {
            return 1;
        } else if (y < b.y) {
            return -1;
        }

        return 0;
    }
}