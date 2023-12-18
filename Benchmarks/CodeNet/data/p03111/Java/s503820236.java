import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static int A, B, C, N;
    static int[] L;
    static List<Integer> listA = new ArrayList<>(), listB = new ArrayList<>(), listC = new ArrayList<>();
    static int min = Integer.MAX_VALUE;

    static void solve(Scanner scanner) {
        N = Integer.parseInt(scanner.next());
        A = Integer.parseInt(scanner.next());
        B = Integer.parseInt(scanner.next());
        C = Integer.parseInt(scanner.next());
        L = new int[N];
        for (int i = 0; i < N; i++) {
            L[i] = Integer.parseInt(scanner.next());
        }

        dfs(0);
        System.out.println(min);
    }

    private static void dfs(int i) {
        if (i == N) {
            // calc
            if (listA.isEmpty() || listB.isEmpty() || listC.isEmpty()) {
                return;
            }
            int cost = 0;
            cost += 10 * (listA.size() - 1 + listB.size() - 1 + listC.size() - 1);
            {
                int sum = 0;
                for(int n: listA) {
                    sum += n;
                }
                cost += Math.abs(A - sum);
            }
            {
                int sum = 0;
                for(int n: listB) {
                    sum += n;
                }
                cost += Math.abs(B - sum);
            }
            {
                int sum = 0;
                for(int n: listC) {
                    sum += n;
                }
                cost += Math.abs(C - sum);
            }
            min = Math.min(min, cost);
            return;
        }

        listA.add(L[i]);
        dfs(i + 1);
        listA.remove(listA.size() - 1);

        listB.add(L[i]);
        dfs(i + 1);
        listB.remove(listB.size() - 1);

        listC.add(L[i]);
        dfs(i + 1);
        listC.remove(listC.size() - 1);

        dfs(i + 1);
    }

}

