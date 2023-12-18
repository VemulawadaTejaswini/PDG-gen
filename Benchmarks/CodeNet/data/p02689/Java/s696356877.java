import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            g.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt()-1;
            int B = sc.nextInt()-1;
            g.get(A).add(B);
            g.get(B).add(A);
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            List<Integer> next = g.get(i);
            boolean ok = true;
            for (int n : next) {
                if (H[i] <= H[n]) {
                    ok = false;
                    break;
                }
            }
            if (ok) ans++;
        }

        System.out.println(ans);
    }
}

