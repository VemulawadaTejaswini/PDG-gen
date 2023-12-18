import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            String[] S = new String[n];
            for (int i = 0; i < n; i++) {
                S[i] = in.next();
            }

            int[] common = new int['z' - 'a' + 1];
            Arrays.fill(common, (int) 1e9);
            int[] counts = new int['z' - 'a' + 1];
            for (int i = 0; i < n; i++) {
                Arrays.fill(counts, 0);
                for (int j = 0; j < S[i].length(); j++) {
                    counts[S[i].charAt(j) - 'a']++;
                }

                for (int j = 0; j < common.length; j++) {
                    common[j] = Math.min(common[j], counts[j]);
                }
            }

            StringBuilder res = new StringBuilder();
            for (int i = 0; i < counts.length; i++) {
                for (int j = 0; j < common[i]; j++) {
                    res.append((char) (i + 'a'));
                }
            }

            System.out.println(res.toString());
        }
    }
}
