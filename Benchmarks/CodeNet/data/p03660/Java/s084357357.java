import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int betweenNum = 0;
    static int onlyWhiteNum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N - 1];
        int[] b = new int[N - 1];
        for (int i = 0; i < N - 1; ++i) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
        }

        System.out.println(solve(a, b));

        sc.close();
    }

    static String solve(int[] a, int[] b) {
        int N = a.length + 1;

        @SuppressWarnings("unchecked")
        List<Integer>[] adjLists = new List[N];
        for (int i = 0; i < adjLists.length; ++i) {
            adjLists[i] = new ArrayList<>();
        }

        for (int i = 0; i < a.length; ++i) {
            adjLists[a[i]].add(b[i]);
            adjLists[b[i]].add(a[i]);
        }

        search(adjLists, N - 1, new boolean[N], 0, 0, false);

        int blackNum = (betweenNum + 1) / 2 + (N - 2 - betweenNum - onlyWhiteNum);
        int whiteNum = betweenNum / 2 + onlyWhiteNum;

        return (blackNum > whiteNum) ? "Fennec" : "Snuke";
    }

    static void search(List<Integer>[] adjLists, int whiteNode, boolean[] visited, int node, int distance,
            boolean onlyWhite) {
        visited[node] = true;

        if (node == whiteNode) {
            betweenNum = distance - 1;
        }

        if (onlyWhite) {
            ++onlyWhiteNum;
        }

        for (int adj : adjLists[node]) {
            if (!visited[adj]) {
                search(adjLists, whiteNode, visited, adj, distance + 1, onlyWhite || (node == whiteNode));
            }
        }
    }
}