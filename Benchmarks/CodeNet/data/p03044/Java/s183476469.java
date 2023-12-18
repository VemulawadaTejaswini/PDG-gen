import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] u = new int[N];
        int[] v = new int[N];
        int[] w = new int[N];


        for (int i=0; i<N-1; i++) {
            u[i] = sc.nextInt();
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }

        int[] color = solve(N, u, v, w);
        for (int i=1; i<=N; i++) {
            System.out.println(color[i]);
        }
    }

    private static int[] solve(int N, int[] u, int[] v, int[] w) {
        int[] color = new int[N+1];
        Arrays.fill(color, -1);
        List<Integer>[] lists = new List[N+1];
        for (int i=1; i<=N; i++) {
            lists[i] = new ArrayList();
        }

        int[][] matrix = new int[N+1][N+1];
        for (int i=0; i<N-1; i++) {
            matrix[u[i]][v[i]] = w[i];
            matrix[v[i]][u[i]] = w[i];
            lists[u[i]].add(v[i]);
            lists[v[i]].add(u[i]);
        }

        int idx = -1;
        for (int i=1; i<=N; i++) {
            if (lists[i].size() == 1) {
                idx = i;
                break;
            }
        }
        color[idx] = 0;
        coloring(color, lists, matrix, idx);

        return color;
    }

    private static void coloring(int[] color, List<Integer>[] linkList, int[][] matrix, int idx) {
       while(linkList[idx].size() > 0) {
           int next = linkList[idx].remove(0);
           if (color[next] != -1) continue;

           color[next] = matrix[idx][next]%2 == 0 ? color[idx] : 1 - color[idx];
           System.err.println("color for " + next + " is " + color[next]);
           coloring(color, linkList, matrix, next);
       }
    }
}
