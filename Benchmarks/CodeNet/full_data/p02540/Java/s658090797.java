import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    int[] parent;
    int[] size;

    private int getRoot(int node) {
        while (parent[node] != node) {
            parent[node] = parent[parent[node]];
            node = parent[node];
        }

        return node;
    }

    private void merge(int i, int j) {
        int rootI = getRoot(i);
        int rootJ = getRoot(j);
        if (rootI == rootJ) return;

        if (size[rootI] > size[rootJ]) {
            parent[rootJ] = rootI;
            size[rootI] += size[rootJ];
        } else {
            parent[rootI] = rootJ;
            size[rootJ] += size[rootI];
        }
    }



    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(f.readLine());
        int[][] coords = new int[n][3];
        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(f.readLine());
            coords[i][0] = Integer.parseInt(tokenizer.nextToken()) - 1;
            coords[i][1] = Integer.parseInt(tokenizer.nextToken()) - 1;
            coords[i][2] = i;
        }

        Arrays.sort(coords, new ArrayComparator());

        TreeSet<int[]> components = new TreeSet<int[]>(new ArrayComparator());

        parent = new int[n];
        size = new int[n];
        Arrays.fill(size, 1);
        for (int i = 0; i < n; i++) parent[i] = i;

        for (int i = 0; i < n; i++) {
            int[] resultingComponent = {coords[i][1], i};
            while (!components.isEmpty() && components.first()[0] <= coords[i][1]) {
                int[] ar = components.pollFirst();
                merge(i, ar[1]);
                resultingComponent[0] = Math.min(ar[0], resultingComponent[0]);
            }
            components.add(resultingComponent);
        }

        int[] res = new int[n];
        for (int i  = 0; i < n; i++) {
            res[coords[i][2]] = size[getRoot(i)];
        }
        for (int i = 0; i < n; i++) out.println(res[i]);
        out.close();
    }



    private static class ArrayComparator implements Comparator<int[]> {

        @Override
        public int compare(int[] o1, int[] o2) {
            return Integer.compare(o1[0], o2[0]);
        }
    }
}