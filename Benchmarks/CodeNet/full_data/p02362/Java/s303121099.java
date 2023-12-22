import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = Integer.parseInt(sc.next());
        int E = Integer.parseInt(sc.next());
        int r = Integer.parseInt(sc.next()); // root
        long INF = 200_000_000_000_000_000L;
        ArrayList<int[]> edge = new ArrayList<int[]>();
        for (int i=0;i<E;i++) {
            int s = Integer.parseInt(sc.next());
            int t = Integer.parseInt(sc.next());
            int d = Integer.parseInt(sc.next());
            int[] add = {s, t, d};
            edge.add(add);
        }

        long[] values = new long[V];
        for (int i=0;i<V;i++) {
            if (i!=r) {
                values[i]=INF;
            }
        }
        int flag = 0;
        for (int k=0;k<V;k++) {
            for (int i=0;i<E;i++) {
                    int[] tmp = edge.get(i);
                    if ((values[tmp[0]] != INF) && (values[tmp[1]] > values[tmp[0]]+tmp[2])) {
                        values[tmp[1]] = values[tmp[0]]+tmp[2];
                        if (k==V-1) {
                            flag=1;
                        }
                    }
            }
        }

        if (flag==1) {
            System.out.println("NEGATIVE CYCLE");
        } else {
            for (int i=0;i<V;i++) {
                if (values[i]==INF) {
                    System.out.println("INF");
                } else {
                    System.out.println(values[i]);
                }
            }
        }
    }
}
