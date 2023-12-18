import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();
        List<Integer> r = new ArrayList<>();
        List<Integer> g = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (s.substring(i, i + 1).equals("R")) {
                r.add(i);
            } else if (s.substring(i, i + 1).equals("G")) {
                g.add(i);
            } else {
                b.add(i);
            }
        }
        int ans = 0;
        for (int i : r) {
            for (int j : g) {
                int max = (i > j) ? i : j;
                int min = (i < j) ? i : j;
                for (int k : b) {
                    int mmax = max;
                    int mmin = min;
                    int mmid = 0;
                    if (k > max) {
                        mmid = max;
                        mmax = k;
                    } else if (k < min) {
                        mmid = min;
                        mmin = k;
                    } else {
                        mmid = k;
                    }
                    if (mmid - mmin != mmax - mmid) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}