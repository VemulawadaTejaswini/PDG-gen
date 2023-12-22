import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    private static int readInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        int H = readInt();
        int W = readInt();
        int Ch = readInt() - 1;
        int Cw = readInt() - 1;
        int Dh = readInt() - 1;
        int Dw = readInt() - 1;

        char[][] g = new char[H][W];
        for (int i = 0; i < H; i++) {
            g[i] = br.readLine().toCharArray();
        }

        int magicCount = 0;
        boolean[][] visited = new boolean[H][W];
        Stack<Integer> todo = new Stack<>();
        todo.add(Ch);
        todo.add(Cw);
        while (!visited[Dh][Dw]) {
            ArrayList<Integer> fronts = new ArrayList<>();
            if (magicCount == 0) {
                fronts.add(Ch);
                fronts.add(Cw);
            }
            while (!todo.isEmpty()) {
                int y = todo.pop();
                int x = todo.pop();
                if (x > 0 && !visited[x - 1][y] && g[x - 1][y] == '.') {
                    todo.push(x - 1);
                    todo.push(y);
                    fronts.add(x - 1);
                    fronts.add(y);
                    visited[x - 1][y] = true;

                }
                if (x < H - 1 && !visited[x + 1][y] && g[x + 1][y] == '.') {
                    todo.push(x + 1);
                    todo.push(y);
                    fronts.add(x + 1);
                    fronts.add(y);
                    visited[x + 1][y] = true;
                }
                if (y > 0 && !visited[x][y - 1] && g[x][y - 1] == '.') {
                    todo.push(x);
                    todo.push(y - 1);
                    fronts.add(x);
                    fronts.add(y - 1);
                    visited[x][y - 1] = true;
                }
                if (y < W - 1 && !visited[x][y + 1] && g[x][y + 1] == '.') {
                    todo.push(x);
                    todo.push(y + 1);
                    fronts.add(x);
                    fronts.add(y + 1);
                    visited[x][y + 1] = true;
                }
            }
            if (visited[Dh][Dw]) {
                System.out.println(magicCount);
                return;
            } else {
                magicCount += 1;
                for (int k = 0; k < fronts.size(); k += 2) {
                    int i = fronts.get(k);
                    int j = fronts.get(k + 1);
                    for (int m = Math.max(0, i - 2); m < Math.min(H, i + 3); m++) {
                        for (int n = Math.max(0, j - 2); n < Math.min(W, i + 3); n++) {
                            if (g[m][n] == '.' && !visited[m][n]) {
                                visited[m][n] = true;
                                if (visited[Dh][Dw]) {
                                    System.out.println(magicCount);
                                    return;
                                }
                                todo.push(m);
                                todo.push(n);
                            }
                        }
                    }
                }
                if (todo.isEmpty()) {
                    if (visited[Dh][Dw]) {
                        System.out.println(magicCount);
                    } else {
                        System.out.println(-1);
                    }
                    return;
                }
            }
        }

        System.out.println(-1);  // Not reachable
    }
}
