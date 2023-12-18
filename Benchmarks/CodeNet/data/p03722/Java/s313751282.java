import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf  = Long.MAX_VALUE;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n   = in.nextInt();
        int m   = in.nextInt();
        List<E> edges = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            int a = in.nextInt()-1;
            int b = in.nextInt()-1;
            long c = -in.nextInt();
            E e = new E(a, b, c);
            edges.add(e);
        }

        long[] dist = new long[n];
        Arrays.fill(dist, inf);
        dist[0] = 0;
        int loopCnt = 0;
        boolean infCond = false;
        while(true) {
            if(loopCnt > 2*n) {
                infCond = true;
                break;
            }

            loopCnt++;
            boolean updated = false;
            for(E e : edges) {
                if(dist[e.from] != inf && dist[e.from] + e.w < dist[e.to]) {
                    dist[e.to] = dist[e.from] + e.w;
                    updated = true;
                }
            }

            if(!updated) break;
        }

        if(infCond) {
            print("inf");
        }else{
            print(-dist[n-1]);
        }
    }

    static void print(String s) {
        System.out.println(s);
    }

    static void print(int i) {
        System.out.println(i);
    }

    static void print(long i) {
        System.out.println(i);
    }
}

class E {
    int from, to;
    long w;
    E(int from, int to, long w) {
        this.from = from;
        this.to = to;
        this.w = w;
    }
}
