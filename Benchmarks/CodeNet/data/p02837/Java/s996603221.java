import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        Map<Integer, List<Integer>> t = new HashMap<>();
        Map<Integer, List<Integer>> f = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(sc.next());
            List<Integer> tl = new ArrayList<>();
            List<Integer> fl = new ArrayList<>();
            for (int j = 0; j < a; j++) {
                int x = Integer.parseInt(sc.next());
                int y = Integer.parseInt(sc.next());
                if(y == 1) {
                    tl.add(x - 1);
                }else {
                    fl.add(x - 1);
                }
            }
            t.put(i, tl);
            f.put(i, fl);
        }

        int res = 0;
        for (int i = 0; i < (1 << N); i++) {
            boolean[] tp = new boolean[N];
            int tc = 0;
            for (int j = 0; j < N; j++) {
                if((1 & i >> j) == 1) {
                    tp[j] = true;
                    tc++;
                }else {
                    tp[j] = false;
                }
            }

            boolean b = true;
            for (int j = 0; j < N; j++) {
                if(!tp[j]) continue;
                for (int ii : t.get(j)) {
                    if(!tp[ii]) {
                        b = false;
                        break;
                    }
                }
                for (int ii : f.get(j)) {
                    if(tp[ii]) {
                        b = false;
                        break;
                    }
                }
            }

            if(b) {
                res = Math.max(res, tc);
            }
        }

        System.out.println(res);
    }
}
