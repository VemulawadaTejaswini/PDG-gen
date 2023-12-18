import java.util.Scanner;

class Problem {
    private String S;

    Problem() {
        Scanner sc = new Scanner(System.in);
        S = sc.next();
    }

    int solve() {
        int max = 0;
        int cur = 0;

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
                cur++;
            } else {
                max = Math.max(max, cur);
                cur = 0;
            }
        }
        max = Math.max(max, cur);

        return max;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Problem().solve());
    }
}
