import java.io.*;
import java.util.*;
import java.math.*;
 
class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static String line;
    public static StringTokenizer st;
    public static ArrayList<ArrayList<Integer>> adjList;
    public static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1, 0};
    public static int[] dy = {0, 1, 0, -1, 1, 1, -1, -1, 0};
    public static int INF = 0x3f3f3f3f;
    public static int MOD = 1000000007;
    public static long LINF = 0x3f3f3f3f3f3f3f3fL;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<Interval> A = new ArrayList<Interval>();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            int cost = Integer.parseInt(st.nextToken());

            A.add(new Interval(a, 0, cost, i));
            A.add(new Interval(b, 1, cost, i));
        }

        Collections.sort(A);

        long[] dist = new long[N];
        Arrays.fill(dist, LINF);
        dist[0] = 0;

        int curIndex = 0;
        TreeMap<Long, Integer> d = new TreeMap<Long, Integer>();
        long[] idxValue = new long[N];
        Arrays.fill(idxValue, -1);

        for (int i = 0; i < N; i++) {
            if (d.size() > 0) {
                dist[i] = Math.min(dist[i], d.firstKey());                
            }

            while (curIndex < A.size() && A.get(curIndex).a == i) {
                Interval cur = A.get(curIndex);
                if (cur.b == 0) {
                    long total = 0;
                    if (i == 0) {
                        total = 0;
                    } else {
                        if (d.size() == 0) {
                            curIndex++;
                            continue;
                        }
                        total = d.firstKey();
                    }
                    long sum = total + cur.cost;
                    if (!d.containsKey(sum)) {
                        d.put(sum, 1);
                    } else {
                        d.put(sum, d.get(sum) + 1);
                    }
                    idxValue[cur.id] = sum;
                } else {
                    long sum = idxValue[cur.id];
                    if (d.containsKey(sum)) {
                        if (d.get(sum) > 1) {
                            d.put(sum, d.get(sum) - 1);
                        } else {
                            d.remove(sum);
                        }
                    }
                }
                curIndex++;
            }
        }

        pw.println(dist[N-1] == LINF ? -1 : dist[N-1]);

        pw.close();
        br.close();
    }
}

class Interval implements Comparable<Interval>{
    public int a, b, cost, id;

    Interval(int _a, int _b, int _cost, int id){
        a = _a;
        b = _b;
        cost = _cost;
        this.id = id;
    }
 
    public String toString(){
        return a + " " + b + " " + cost;
    }

    public int compareTo(Interval p){
        if (a != p.a) return a < p.a ? -1 : 1;
        if (b != p.b) return b < p.b ? -1 : 1;
        if (cost != p.cost) return cost < p.cost ? -1 : 1;
        return 0;
    }
}