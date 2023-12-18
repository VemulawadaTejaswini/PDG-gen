import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }


    // int N = Integer.parseInt(scanner.nextLine());
    // int N = scanner.nextInt(), M = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        String S = scanner.nextLine();
        int[] right = new int[S.length()], left = new int[S.length()];
        right[0] = 0;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == 'R') {
                right[i] = i;
            } else {
                right[i] = right[i - 1];
            }
        }
        left[S.length() - 1] = S.length() - 1;
        for (int i = S.length() - 2; i >= 0; i--) {
            if (S.charAt(i) == 'L') {
                left[i] = i;
            } else {
                left[i] = left[i + 1];
            }
        }

        int ans[] = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'R') {
                int diff = left[i] - i;
                if (diff % 2 == 0) {
                    ans[left[i]]++;
                } else {
                    ans[left[i] - 1]++;
                }
            } else {
                int diff = i - right[i];
                if (diff % 2 == 0) {
                    ans[right[i]]++;
                } else {
                    ans[right[i] + 1]++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int n: ans) {
            sb.append(n);
            sb.append(' ');
        }

        System.out.println(sb.toString().trim());
    }

}
