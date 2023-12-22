import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = Integer.parseInt(sc.next());
        int E = Integer.parseInt(sc.next());
        long[][] edge = new long[V][V];
        long INF = 200_000_000_000_000L;
        for (int i=0;i<V;i++) {
            for (int j=0;j<V;j++) {
                if (i==j) {
                    continue;
                }
                edge[i][j] = INF;
            }
        }
        for (int i=0;i<E;i++) {
            int s = Integer.parseInt(sc.next());
            int t = Integer.parseInt(sc.next());
            long d = Long.parseLong(sc.next());
            edge[s][t] = d;
        }
        for (int k=0;k<V;k++) {
            for (int i=0;i<V;i++) {
                for (int j=0;j<V;j++) {
                    if(edge[i][k] != INF && edge[k][j] != INF) {
                    if (edge[i][j]>edge[i][k]+edge[k][j]) {
                        edge[i][j] = edge[i][k]+edge[k][j];
                    }
                    }
                }
            }
        }
        int flag = 0;
        for (int i=0;i<V;i++) {
            if (edge[i][i]!=0) {
                System.out.println("NEGATIVE CYCLE");
                flag=1;
                break;
            }
        }
        if (flag==0) {
            for (int i=0;i<V;i++) {
                for (int j=0;j<V;j++) {
                    if (edge[i][j]==200_000_000_000_000L) {
                        System.out.print("INF");
                    } else {
                        System.out.print(edge[i][j]);
                    }
                    if (j==V-1) {
                        System.out.println("");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
        // System.out.println(Arrays.deepToString(edge));
    }
}
