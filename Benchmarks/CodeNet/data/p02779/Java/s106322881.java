import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static Scanner sc;
    private static int N;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(solve() ? "YES" : "NO");

    }

    private static boolean solve() {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            if (!set.add(sc.nextInt())) {
                return false;
            }
        }
        return true;
    }

}
