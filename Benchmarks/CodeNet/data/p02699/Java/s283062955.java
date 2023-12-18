import java.io.*;
import java.util.*;
public class Main {
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String line;
    static int n, k, T, N, m, Q, q, R, C, x, M, id, x0, y0, g, y, d, SCC;
    static StringTokenizer st;
    static Scanner in = new Scanner(System.in);
    static char[][] word;
    static IP[][] parent;
    static BitSet onStack = new BitSet(100000);
    static ArrayList<Integer> graph[];
    static int[] low, ids;
    static Stack<Integer> stack;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());pw.println(Integer.parseInt(st.nextToken())>Integer.parseInt(st.nextToken())
        ?"safe":"unsafe");
            pw.flush();

        }
        static class IP {
            int row, col;

            public IP(int row, int col) {
                this.row = row;
                this.col = col;
            }
        }
        static void extendedEuclid ( int a, int b){
            if (b == 0) {
                x = 1;
                y = 0;
                d = a;
                return;
            }
            extendedEuclid(b, a % b);
            int x1 = y;
            int y1 = x - (a / b) * y;
            x = x1;
            y = y1;
        }
        static boolean isEven ( int i){
            return (i & 1) == 0;
        }
        static boolean isOdd ( int i){
            return (i & 1) == 1;
        }
        static class Edge implements Comparable<Edge> {
            int u, v;
            double weight;

            Edge(int u, int v, double weight) {
                this.u = u;
                this.v = v;
                this.weight = weight;
            }

            @Override
            public int compareTo(Edge edge) {
                return (int) (weight - (int) edge.weight);
            }
        }
        static class DisjointSet {
            int[] parent, rank;

            void make_set(int v) {
                parent = new int[v];
                for (int i = 0; i < v; i++)
                    parent[i] = i;
                rank = new int[v];
            }

            int find_set(int v) {
                if (v == parent[v])
                    return v;
                return parent[v] = find_set(parent[v]);//compress the step
            }

            void union_set(int a, int b) {
                a = find_set(a);
                b = find_set(b);
                if (a != b) {
                    if (rank[a] < rank[b]) {
                        int c = a;
                        a = b;
                        b = c;
                    }
                    parent[b] = a;
                    if (rank[a] == rank[b])
                        rank[a]++;
                }
            }
        }
    }

