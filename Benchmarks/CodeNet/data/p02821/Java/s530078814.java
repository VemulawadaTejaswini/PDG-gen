import java.io.*;
import java.util.*;
import java.math.*;
 
class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static String line;
    public static StringTokenizer st, st2;
    public static ArrayList<ArrayList<Integer>> adjList;
    public static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1, 0};
    public static int[] dy = {0, 1, 0, -1, 1, 1, -1, -1, 0};
    public static int INF = 0x3f3f3f3f;
    public static int MOD = 1000000007;
    public static long LINF = 0x3f3f3f3f3f3f3f3fL;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        int[] A = new int[N];

        st = new StringTokenizer(br.readLine());
        TreeMap<Integer, Integer> d = new TreeMap<Integer, Integer>();

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        for (int i = 0; i < N; i++) {
            if (!d.containsKey(A[i])) {
                d.put(A[i], i);
            }
        }

        // System.out.println(d);

        long[] acc = new long[N];
        for (int i = N-1; i >= 0; i--) {
            acc[i] = A[i];
            if (i != N-1) {
                acc[i] += acc[i+1];
            }
        }

        int a = 0;
        int b = A[A.length-1] * 2;

        while (a != b) {
            int mid = (a + b + 1) / 2;
            long totalCnt = 0;
            for (int i = 0; i < N; i++) {
                int target = mid - A[i];
                Integer higherKey = d.higherKey(target-1);
                if (higherKey != null) {
                    totalCnt += N - d.get(higherKey);
                }
            }
            if (totalCnt < M) {
                b = mid - 1;
            } else {
                a = mid;
            }
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            if (M == 0) break;
            int target = a - A[i];
            Integer higherKey = d.higherKey(target);
            if (higherKey != null) {
                int nums = (int) (Math.min(N-d.get(higherKey), M));
                M -= nums;
                ans += A[i] * nums;
                ans += acc[N - nums];
            }
        }
        ans += (M * a);

        pw.println(ans);

        pw.close();
        br.close();
    }
}

class Pair implements Comparable<Pair>{
    public int a;
    public long b;

    Pair(int _a, long _b){
        a = _a;
        b = _b;
    }
 
    public String toString(){
        return a + " " + b;
    }

    public int compareTo(Pair p){
        if (b != p.b) return b < p.b ? -1 : 1;
        if (a != p.a) return a < p.a ? -1 : 1;
        return 0;
    }
}