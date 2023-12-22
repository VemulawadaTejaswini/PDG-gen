import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    static ArrayList<Integer> counter = new ArrayList<>();

    static {
        counter.add(1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        long N = Long.parseLong(line);
        double Nd = (double) N;
        int lim = (int) Math.sqrt(Nd) + 1;
        HashSet<Integer> pSet = new HashSet<>();
        int cnt = 0;
        for (int i = 2; i < lim; i++) {
            if (isP(i, pSet)) {
                int res = div(N, i);
                if (res != 0) {
                    cnt += count(res);
                }
                pSet.add(i);
            }
        }
        System.out.println(cnt);
    }

    private static int count(int src) {
        int size = counter.size();
        for (int i = 0; i < size; i++) {
            int l = counter.get(i);
            if (src < l) {
                return i;
            }
        }
        int max = counter.get(size - 1);
        for (int i = size; ; i++) {
            max += i;
            counter.add(max);
            if (src < max) {
                return i;
            }
        }
    }

    private static int div(long src, int p) {
        int cnt = 0;
        while (true) {
            if (src / p * p == src) {
                src = src / p;
                cnt++;
            } else {
                return cnt;
            }
        }
    }

    private static boolean isP(int src, HashSet<Integer> pSet) {
        for (Integer p : pSet) {
            if (src / p * p == src) {
                return false;
            }
        }
        return true;
    }
}
