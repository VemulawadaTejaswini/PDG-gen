import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        char[] s = sc.nextLine().toCharArray();
        int ans = 0;
        int tmp = 0;
        for (char c : s) {
            if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
                tmp++;
            } else {
                ans = Math.max(ans, tmp);
                tmp = 0;
            }
        }
        System.out.println(ans);
    }
}