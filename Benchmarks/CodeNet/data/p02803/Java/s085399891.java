import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.System.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int nRows = Integer.parseInt(st.nextToken());
        int nCols = Integer.parseInt(st.nextToken());
        char[][] maze = new char[nRows][nCols];

        for (int i = 0; i < nRows; i++) {
            maze[i] = in.readLine().toCharArray();
        }

        int ans = 0;
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nCols; j++) {
                for (int k = 0; k < nRows; k++) {
                    for (int l = 0; l < nCols; l++) {
                        if (maze[i][j] == '#' || maze[k][l] == '#') continue;
                        ans = Math.max(ans, dist(maze, i,j, k,l));
                    }
                }
            }
        }

        out.println(ans);

    }

    static class Coor {
        int r, c;

        public Coor(int r, int c) {
            this.r = r;
            this.c = c;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Coor coor = (Coor) o;
            return r == coor.r &&
                    c == coor.c;
        }

        @Override
        public int hashCode() {
            return Objects.hash(r, c);
        }
    }

    static  int DX[] = {1,0,-1,0};
    static  int DY[] = {0,1,0,-1};


    static int dist(char[][] maze, int i, int j, int k, int l) {
        int nRows = maze.length;
        int nCols = maze[0].length;
        Coor dest = new Coor(k, l);
        LinkedList<Coor> quue = new LinkedList<>();
        quue.offer(new Coor(i, j));
        HashSet<Coor> visited = new HashSet<>();
        LinkedList<Integer> S = new LinkedList<>();
        S.offer(0);
        while (!quue.isEmpty()) {
            Coor curr = quue.poll();
            int steps = S.poll();
            if (visited.contains(curr)) continue;;
            visited.add(curr);
            if (curr.equals(dest)) {
                return steps;
            }
            int r = curr.r;
            int c = curr.c;
            if (r < 0 || r >= nRows || c < 0 || c >= nCols) continue;
            if (maze[r][c] == '#') continue;
            for (int m = 0; m < 4; m++) {
                int nr = r + DX[m];
                int nc = c + DY[m];
                quue.offer(new Coor(nr, nc));
                S.offer(steps+1);
            }
        }
        //out.println(i + "," + j + " - " + k + ", " + l);
        throw new RuntimeException("unreachable");
    }

}
