import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().solve();
    }

    Scanner sc = new Scanner(System.in);
    Random rnd = new Random();
    HashSet<Long> used = new HashSet<Long>();
    long[][] hashTable;
    int N;

    void solve() {
        N = sc.nextInt();
        boolean[][] board = new boolean[N][N];
        hashTable = new long[N][N];
        int hash = 0;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            for (int j = 0; j < N; j++) {
                hashTable[i][j] = rnd.nextLong();

                if (s.charAt(j) == '#') {
                    board[i][j] = true;
                    hash ^= hashTable[i][j];
                    cnt++;
                } else board[i][j] = false;
            }
        }

        ArrayDeque<State> q = new ArrayDeque<State>();
        State initS = new State();
        initS.b = board;
        initS.hash = hash;
        initS.d = 0;
        initS.cnt = cnt;
        q.push(initS);
        int ans = -1;
        while (!q.isEmpty()) {
            State state = q.poll();

            if (state.cnt == N * N) {
                ans = state.d;
                break;
            }

            if (used.contains(state.hash))
                continue;

            used.add(state.hash);

            for (int i = 0; i < N; i++) {
                boolean[] row = new boolean[N];
                System.arraycopy(state.b[i], 0, row, 0, N);
                for (int j = 0; j < N; j++) {
                    boolean[][] nb = new boolean[N][N];
                    for (int k = 0; k < N; k++) System.arraycopy(state.b[k], 0, nb[k], 0, N);
                    long h = state.hash;
                    int c = state.cnt;
                    for (int k = 0; k < N; k++) {
                        if (!nb[k][j] && row[k]) {
                            h ^= hashTable[k][j];
                            c++;
                        }
                        if (nb[k][j] && !row[k]) {
                            h ^= hashTable[k][j];
                            c--;
                        }
                        nb[k][j] = row[k];
                    }
                    if (state.hash == h) continue;
                    State newState = new State();
                    newState.b = nb;
                    newState.hash = h;
                    newState.d = state.d + 1;
                    newState.cnt = c;
                    q.addLast(newState);
                }
            }
        }

        System.out.println(ans);
    }

    class State {
        public boolean[][] b;
        public long hash;
        public int d;
        public int cnt;
    }
}
