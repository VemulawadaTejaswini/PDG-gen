import java.util.*;

// first get the dist matrix by floyd algo
// then get the permutation of the route
// then cal the minimum
//

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt();

        int[][] g = new int[N][N];
        int[][] dist = new int[N][N];
        List<Integer> r = new ArrayList<>();
        for (int i = 0; i < R; i++) r.add(sc.nextInt());

        // this is just to store the edges, so as to initialize the dist matrix
        List<List<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            edges.add(Arrays.asList(sc.nextInt(), sc.nextInt(),sc.nextInt()));
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    dist[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        for (List<Integer> edge : edges) {
            dist[edge.get(0) - 1][edge.get(1) - 1] = edge.get(2);
            dist[edge.get(1) - 1][edge.get(0) - 1] = edge.get(2);
        }

        List<List<Integer>> routes = new ArrayList<>();

        /* interesting sp algo */
        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    // if any of the ik and kj is infinite, then i just doesn't make sense, continue
                    if (dist[i][k] != Integer.MAX_VALUE
                        && dist[k][j] != Integer.MAX_VALUE
                        && dist[i][j] > dist[i][k] + dist[k][j])

                        dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }

        permutation(routes, r, 0);

        int ans = Integer.MAX_VALUE;
        for (List<Integer> route : routes) {
            int tmp = dist(route, dist);
            if (tmp < ans)
                ans = tmp;
        }

        System.out.println(ans);

    }

    public static int dist(List<Integer> route, int[][] dist) {
        int ans = 0;
        for (int i = 1; i < route.size(); i++) {
            ans += dist[route.get(i - 1) - 1][route.get(i) - 1];
        }

        return ans;
    }

    public static void permutation(List<List<Integer>> routes, List<Integer> perm, int cnt) {
        if (cnt == perm.size()) {
            routes.add(new ArrayList<>(perm));
            return;
        }

        for (int i = cnt; i < perm.size(); i++) {
            Collections.swap(perm, i, cnt);
            permutation(routes, perm, cnt + 1);
            Collections.swap(perm, i, cnt);
        }
    }

}
