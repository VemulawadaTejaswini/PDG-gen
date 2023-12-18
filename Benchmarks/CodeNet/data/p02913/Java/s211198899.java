import java.util.Scanner;

class Solver {
    void solve(Scanner sc) {
        int N = sc.nextInt();
        String S = sc.next();

        int[] len = new int[N * N / 2];
        int max = 0;
        char[] chars = S.toCharArray();
        for (int offset = N / 2; offset > max; offset--) {
            int row = (offset - 1) * N / 2;
            for (int i = 0; i < N - offset; i++) {
                if (chars[i] != chars[i + offset]) continue;
                int combo = i > 0 ? len[row + (i - 1)] + 1 : 1;
                if (combo >= offset) {
                    System.out.println(offset);
                    return;
                }
                max = Math.max(max, len[row + i] = combo);
            }
        }
        System.out.println(max);
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}