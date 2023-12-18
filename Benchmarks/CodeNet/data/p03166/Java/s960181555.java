import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();

        int V = nextInt(), E = nextInt();

        adjacency = new HashMap<>();

        for (int i = 0; i < V; i++) adjacency.put(i + 1, new ArrayList<>());

        for (int i = 0; i < E; i++) adjacency.get(nextInt()).add(nextInt());

        seen = new boolean[V + 1];

        longestPathFrom = new int[V + 1];

        for (int i = 1; i <= V; i++) if (!seen[i]) calcLongestPathFrom(i);

        System.out.println(Arrays.stream(longestPathFrom).max().getAsInt());
    }

    private static Map<Integer, ArrayList<Integer>> adjacency;
    private static boolean[] seen;
    private static int[] longestPathFrom;

    private static int calcLongestPathFrom(int v) {
        if (seen[v]) return longestPathFrom[v];
        seen[v] = true;
        if (adjacency.get(v).isEmpty()) return 0;
        int longestPath = 0;
        for (int adj: adjacency.get(v)) longestPath = Math.max(longestPath, 1 + calcLongestPathFrom(adj));

        longestPathFrom[v] = longestPath;
        return longestPath;
    }

    //Input Reader
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    private static void init() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }

    private static String next() throws IOException {
        String read;
        while (!tokenizer.hasMoreTokens()) {
            read = reader.readLine();
            if (read == null || read.equals(""))
                return "-1";
            tokenizer = new StringTokenizer(read);
        }

        return tokenizer.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
}