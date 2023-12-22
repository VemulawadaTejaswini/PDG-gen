import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        int h = Integer.parseInt(tokenizer.nextToken());
        int w = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        int[][] targets  = new int[m][2];
        int[] rows = new int[h];
        HashSet<Integer>[] colsInRow = new HashSet[h];
        for (int i = 0; i < h; i++) colsInRow[i] = new HashSet<Integer>();
        int[] cols = new int[w];
        for (int i = 0; i < m; i++) {
            tokenizer = new StringTokenizer(f.readLine());
            targets[i][0] = Integer.parseInt(tokenizer.nextToken()) - 1;
            targets[i][1] = Integer.parseInt(tokenizer.nextToken()) - 1;
            rows[targets[i][0]]++;
            cols[targets[i][1]]++;
        }

        int maxInACol = 0;
        for (int i = 0; i < w; i++) {
            maxInACol = Math.max(maxInACol, cols[i]);
        }
        int maxInARow = 0;
        for (int i = 0; i < h; i++) {
            maxInARow = Math.max(maxInARow, rows[i]);
        }


        HashMap<Integer, Integer> colUsed = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> rowUsed = new HashMap<Integer, Integer>();
        for (int i = 0; i < w; i++) {
            if (cols[i] == maxInACol) colUsed.put(i, 0);
        }
        ArrayList<Integer> maxRows = new ArrayList<Integer>();
        for (int i = 0; i < h; i++) {
            if (rows[i] == maxInARow) rowUsed.put(i, 0);
        }



        for (int[] coord : targets) {
            if (rowUsed.containsKey(coord[0]) && colUsed.containsKey(coord[1])) {
                rowUsed.put(coord[0], rowUsed.get(coord[0]) + 1);
                colUsed.put(coord[1], colUsed.get(coord[1]) + 1);
            }
        }

        boolean foundPerfect = false;
        for (int row : rowUsed.keySet()) {
            if (rowUsed.get(row) != colUsed.keySet().size()) foundPerfect = true;
        }

        if (foundPerfect) {
            out.println(maxInACol + maxInARow);
        } else {
            out.println(maxInACol + maxInARow - 1);
        }
        out.close();
    }
}