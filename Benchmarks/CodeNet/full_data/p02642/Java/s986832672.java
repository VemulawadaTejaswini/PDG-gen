import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input
            int N = Integer.parseInt(sc.next());
            Integer[] a = new Integer[N];
            for (int i = 0; i < N; i++) {
                a[i] = Integer.parseInt(sc.next());
            }
            Arrays.sort(a, Comparator.reverseOrder());

            // Calc
            int cnt = 0; boolean hit = false;
            for (int i = 0; i < N - 1; i++) {
                hit = false;
                for (int j = i + 1; j < N; j++) {
                    if (a[i] % a[j] == 0) {
                        hit = true;
                        break;
                    }
                }
                if (!hit) cnt++;
            }
            if (N >= 2 && a[N - 1] != a[N - 2]) cnt++;
            System.out.println(cnt);
        }
    }
}