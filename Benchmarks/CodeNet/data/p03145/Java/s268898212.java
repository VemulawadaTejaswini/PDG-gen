import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ans = solve(a, b, c);
        System.out.println(ans);
    }

    private static int solve(int a, int b, int c) {
        int max = 0;
        max = Math.max(a, b);
        max = Math.max(max, c);

        int[] line = { a, b, c };
        int ans = 1;
        for (int i = 0; i < 3; i++) {
            if (line[i] == max) {
                continue;
            } else {
                ans *= line[i];
            }
        }
        ans /= 2;

        return ans;
    }
}
