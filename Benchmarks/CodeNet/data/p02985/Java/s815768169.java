import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main2 {

    static class Vertex {

        int num;

        List<Integer> edges = new LinkedList<>();

        public Vertex(int num) {

            this.num = num;
        }
    }

    static int N;

    static int K;

    static long result = 1;

    static long mod = 1000000007;
    static int[] leaf;

    static Vertex[] nodes;


    static boolean check[];

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        N = s.nextInt();

        K = s.nextInt();

        leaf = new int[N];

        nodes = new Vertex[N+1];

        check = new boolean[N+1];

        for (int i = 1; i <= N; i++) {

            nodes[i]= new Vertex(i);
        }

        for (int i = 0; i < N-1; i++) {

            int v1 = s.nextInt();

            int v2 = s.nextInt();

            nodes[v1].edges.add(v2);

            nodes[v2].edges.add(v1);
        }

        dfs(nodes[1],0);

        System.out.println(result);


    }

    public static void dfs(Vertex v , int depth) {

        int rank = Math.max(K-2, K-depth);

        long num = rank - leaf[depth];

        result = (result%mod * num)%mod;

        leaf[depth]++;

        check[v.num] = true;

        for (int k  : v.edges) {

            if (check[k] == false) {

                dfs(nodes[k] , depth+1);
            }
        }
    }
}
