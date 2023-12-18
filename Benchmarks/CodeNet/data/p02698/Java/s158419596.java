import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

import java.util.*;

public class Main {
	static int N;
	static int[] a;
    static ArrayList<ArrayList<Integer>> edge;
    static ArrayList<ArrayList<Integer>> children;
    static int[] parent;
    static boolean[] visited;
    static int[] dp;

    static void dfs(int x, Integer[] arr) {
        if (visited[x]) return;
        visited[x] = true;
        int index = ~Arrays.binarySearch(arr, a[x], (o1, o2) -> o1>=o2 ? 1 : -1);
        int before_a_x = arr[index];
        arr[index] = a[x];
        dp[x] = ~Arrays.binarySearch(arr, 999_999_999, (o1, o2)-> o1>=o2 ? 1 : -1);

        for (Integer i : edge.get(x)) {
            if (!visited[i]) {
                children.get(x).add(i);
                parent[i] = x;
                dfs(i, arr);
            }
        }

        arr[index] = before_a_x;
    }

	public static void main(String[] args) {
		InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
		N = in.nextInt();
		a = new int[N];
        edge = new ArrayList<ArrayList<Integer>>();
        children = new ArrayList<ArrayList<Integer>>();
        parent = new int[N];
        parent[0] = -1;
        dp = new int[N];
		for (int i=0;i<N;i++) {
			a[i] = in.nextInt();
		}
        for (int i=0;i<N;i++) {
            ArrayList<Integer> add_1 = new ArrayList<Integer>();
            ArrayList<Integer> add_2 = new ArrayList<Integer>();
            edge.add(add_1);
            children.add(add_2);
        }

		for (int i=0;i<N-1;i++) {
			int u = in.nextInt()-1;
			int v = in.nextInt()-1;
            edge.get(u).add(v);
            edge.get(v).add(u);
		}

        visited = new boolean[N];
        int INF = 1_000_000_000;
        Integer[] arr = new Integer[N];
        Arrays.fill(arr, INF);
        dfs(0, arr);
        for (int i=0;i<N;i++) {
        	out.println(dp[i]);
        }

		out.close();
	}

	static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}
