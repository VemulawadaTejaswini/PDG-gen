import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();

        int[] ls = new int[n];
        for (int i = 0; i < n; i++) {
            ls[i] = std.nextInt();
        }

        long ans = 0;
        Integer[] sortedLs = Arrays.stream(ls).sorted().boxed().toArray(Integer[]::new);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int ab = sortedLs[i] + sortedLs[j];
                int nn = ~Arrays.binarySearch(sortedLs, ab, (l, r) -> (l.compareTo(r) >= 0) ? 1:-1);
                int diffIndex = nn - (j + 1);

                ans += Math.max(0, diffIndex);
            }
        }
        System.out.println(ans);
    }
}
