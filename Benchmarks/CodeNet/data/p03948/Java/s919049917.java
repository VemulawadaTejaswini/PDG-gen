import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    // int N = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int N = scanner.nextInt(), T = scanner.nextInt();
        scanner.nextLine();
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int min = a[0];
        int max = 0;
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
            max = Math.max(max, a[i] -min);
        }

        int cnt = 0;
        min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
            if (a[i] - min == max) {
                min = a[i];
                cnt++;
            }
        }

        System.out.println(cnt);

    }

}
