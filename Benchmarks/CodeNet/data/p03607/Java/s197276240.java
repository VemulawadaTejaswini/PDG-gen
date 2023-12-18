import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println( solve(N, A) );
    }

    private static int solve(int N, int[] A) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            int a = A[i];
            if( set.contains(a) ) {
                set.remove(a);
            } else {
                set.add(a);
            }
        }

        return set.size();
    }
}
