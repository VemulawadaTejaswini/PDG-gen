import java.util.*;


public class Main {

    private static int x ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        int[] Q = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            Q[i] = sc.nextInt();
        }

        List<Integer> remain = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            remain.add(i);
        }

        List<Integer> work = new ArrayList<>();
        dfs(remain, 0, work, P);
        int a = x;
        dfs(remain, 0, work, Q);
        int b = x;

        System.out.println(Math.abs(a-b));
    }

    private static int dfs(List<Integer> remain, int n, List<Integer> work, int[] X) {
        if (remain.isEmpty()) {
            boolean match = true;
            for (int i = 0; i < X.length; i++) {
                if (work.get(i) != X[i]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                x = n+1;
            }
            return n+1;
        }

        int nn = n;
        for (int i = 0; i < remain.size(); i++) {

            int tmp = remain.get(i);
            work.add(tmp);
            List<Integer> remain2 = new ArrayList<>();
            for (int j = 0; j < remain.size(); j++) {
                if (j == i) continue;
                remain2.add(remain.get(j));
            }
            nn = dfs(remain2, nn, work, X);

            work.remove(work.size()-1);
        }

        return nn;
    }
}
