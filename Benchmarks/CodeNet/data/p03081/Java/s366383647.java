import java.util.Scanner;

class Problem {
    private int N;
    private int Q;
    private String s;
    private char[] ts;
    private char[] ds;

    Problem() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Q = sc.nextInt();
        s = sc.next();

        ts = new char[Q];
        ds = new char[Q];
        for(int i = 0; i < Q; i++) {
            ts[i] = sc.next().charAt(0);
            ds[i] = sc.next().charAt(0);
        }
    }

    int solve() {
        int left = 0;
        int right = N - 1;

        for (int i = Q - 1; i >= 0; i--) {
            if (left < Q && ds[i] == 'L' && ts[i] == s.charAt(left)) {
                left++;
            }
            if (right >= 0 && ds[i] == 'R' && ts[i] == s.charAt(right)) {
                right--;
            }
        }

        return Math.max(right - left + 1, 0);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Problem().solve());
    }
}
