
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * DFSによる解法
 *
 * @author kou
 *
 */
public class Main {

    static boolean[] isConnected;

    static List<Set<Integer>> edgeList = new ArrayList<Set<Integer>>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int m = Integer.parseInt(scan.next());

        for (int i = 0; i < n; i++) {
            edgeList.add(new HashSet<Integer>());
        }
        isConnected = new boolean[n];

        int[] a = new int[m];
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = Integer.parseInt(scan.next());
            b[i] = Integer.parseInt(scan.next());
            a[i]--;
            b[i]--;
            edgeList.get(a[i]).add(b[i]);
            edgeList.get(b[i]).add(a[i]);
        }
        scan.close();

        int ans = 0;
        for (int i = 0; i < m; i++) {
            edgeList.get(a[i]).remove(b[i]);
            edgeList.get(b[i]).remove(a[i]);

            Arrays.fill(isConnected, false);
            dfs(0);
            for (int j = 0; j < n; j++) {
                if (!isConnected[j]) {
                    ans++;
                    break;
                }
            }

            edgeList.get(a[i]).add(b[i]);
            edgeList.get(b[i]).add(a[i]);
        }

        System.out.println(ans);
    }

    private static void dfs(int i) {
        isConnected[i] = true;

        for (int node : edgeList.get(i)) {
            if (!isConnected[node]) {
                dfs(node);
            }
        }
    }

}
