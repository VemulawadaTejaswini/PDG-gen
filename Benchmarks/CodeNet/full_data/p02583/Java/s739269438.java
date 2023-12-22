import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // in
            int n = Integer.parseInt(sc.next());
            long[] l = new long[n];
            for (int i = 0; i < n; i++) {
                l[i] = Integer.parseInt(sc.next());
            }

            // calc
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    for (int k = j + 1; k < n; k++) {
                        if (l[i] == l[j] || l[j] == l[k] || l[k] == l[i]) continue;
                        if (Math.abs(l[i] - l[j]) < l[k] && l[k] < l[i] + l[j]) {
                            cnt++;
                        }
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}