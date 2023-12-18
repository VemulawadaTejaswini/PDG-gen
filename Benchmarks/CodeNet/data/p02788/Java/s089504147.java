import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        HashMap<Integer, Long> points = new HashMap<>();
        int[] X = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(in.readLine());
            int x = Integer.parseInt(st.nextToken());
            long h = Long.parseLong(st.nextToken());
            points.put(x, h);
            X[i] = x;
        }

        Arrays.sort(X);

        int pA = X[0];
        int pM = pA + D;
        int pB = D + pM;

        int k = 0;
        TreeSet<Integer> inReach = new TreeSet<>();
        for (int p : X) {
            if (pA <= p && p <= pB) {
                inReach.add(p);
                ++ k;
            }
        }

        long ans = 0;
        while (true) {
            if (inReach.isEmpty()) {
                pA = X[k];
                pM = pA + D;
                pB = D + pM;
                for (int p : X) {
                    if (pA <= p && p <= pB) {
                        inReach.add(p);
                        ++k;
                    }
                }
            }

            int e = inReach.first();
            long h = points.get(inReach.first());
            long nBombs = h / A;
            if (h % A > 0) ++ nBombs;

            if (e < pA + 1 && h > 0) {
                // destroy current target
                // tree.add(pA, pB, -h)
                for (int p : inReach) {
                    points.put(p, points.get(p) - nBombs*A);
                }
                inReach.pollFirst();
                ans += nBombs;
            }

            if ( points.containsKey(pB + 1) ) {
                inReach.add(pB + 1);
                ++ k;
            }

            ++ pA;
            ++ pB;
            ++ pM;

            if (pA > X[N-1]) {
                break;
            }

        }

        System.out.println(ans);
    }

}