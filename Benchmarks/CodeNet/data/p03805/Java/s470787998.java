import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static int N;
    private static int M;
    private static int[] A;
    private static int[] B;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = new int[M];
        B = new int[M];
        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        System.out.println( solve() );
    }

    private static int solve() {
        Set<Integer> path = new HashSet<>();
        path.add(1);
        return _solve(1, path);
    }

    private static int _solve(int node, Set<Integer> path) {
        if( path.size() == N ) return 1;

        int ans = 0;
        for (int i = 0; i < M; i++) {
            if( A[i] == node ) {
                int to = B[i];
                if( !path.contains(to) ) {
                    Set<Integer> newPath = new HashSet<>(path);
                    newPath.add(to);
                    ans += _solve(to, newPath);
                }
            }

            if( B[i] == node ) {
                int to = A[i];
                if( !path.contains(to) ) {
                    Set<Integer> newPath = new HashSet<>(path);
                    newPath.add(to);
                    ans += _solve(to, newPath);
                }
            }
        }
        return ans;
    }
}