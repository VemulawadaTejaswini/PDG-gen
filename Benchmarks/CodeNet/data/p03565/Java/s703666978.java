import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Solver().solve(new Scanner(System.in));
//        new Solver().solve(new Scanner(ex));
    }

//    private static final String ex = "?tc????\n" +
//        "coder";
    private static final String ex = "??p??d??\n" +
            "abc\n";
}

class Solver {
    void solve(Scanner scanner) {
        char[] S = scanner.nextLine().toCharArray();
        char[] T = scanner.nextLine().toCharArray();

        for (int i = S.length - 1; i >= 0; i --) {
            if (S[i] == T[0] && i + T.length <= S.length) {
                boolean flag = true;
                for (int j = 0; j < T.length; j ++) {
                    if (!(S[i + j] == T[j] || S[i + j] == '?')) {
                        flag = false;
                    }
                }
                if (flag) {
                    for (int j = 0; j < T.length; j ++) {
                        S[i + j] = T[j];
                    }

                    for (int k = 0; k < S.length; k++) {
                        if (S[k] == '?') S[k] = 'a';
                    }
                    System.out.println(new String(S));
                    System.exit(0);
                }
            }
        }

        System.out.println("UNRESTORABLE");
    }

    private int[] splitInt(String s) {
        String[] split = s.split(" ");
        int[] splitInt = new int[split.length];
        for (int i = 0; i < split.length; i ++) {
            splitInt[i] = Integer.parseInt(split[i]);
        }
        return splitInt;
    }

    private long[] splitLong(String s) {
        String[] split = s.split(" ");
        long[] splitLong = new long[split.length];
        for (int i = 0; i < split.length; i ++) {
            splitLong[i] = Long.parseLong(split[i]);
        }
        return splitLong;
    }
}
