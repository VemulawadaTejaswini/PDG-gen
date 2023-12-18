import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int a[] = new int[N];
        int b[] = new int[N];
        HashMap<Integer, Integer> trees[] = new HashMap[N];
        int maxSides = 0;
        for (int i = 0; i < N; i++) {
            trees[i] = new HashMap();
        }

        for (int i = 0; i < N-1; i++) {
            a[i] = scan.nextInt() - 1;
            b[i] = scan.nextInt() - 1;
            trees[a[i]].put(b[i], 0);
            trees[b[i]].put(a[i], 0);

            if (maxSides < trees[a[i]].size())
                maxSides = trees[a[i]].size();
            if (maxSides < trees[b[i]].size())
                maxSides = trees[b[i]].size();
        }

        //K
        os.println(maxSides);

        dfs(0, -1, -1, trees);

        for(int i = 0; i < N-1; i++) {
            os.println(trees[a[i]].get(b[i]));
        }
    }


    static void dfs(int to, int root, int rootColor, HashMap<Integer, Integer>[] trees) {
        if(root >= 0) {
            trees[to].put(root, rootColor);
        }
        int color = 1;
        for (Integer child: trees[to].keySet()) {
            if (child == root)
                continue;
            if(color == rootColor)
                color++;
            trees[to].put(child, color);
            dfs(child, to, color++, trees);
        }

    }
}