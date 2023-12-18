import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// C - Distinct or Not
// https://atcoder.jp/contests/abc154/tasks/abc154_c
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        Set<Integer> set = new HashSet<>();
        for (int i = 0;i<N;i++) {
            set.add(Integer.parseInt(scanner.next()));
        }
        scanner.close();

        System.out.println(N == set.size() ? "YES" : "NO");
    }
}
