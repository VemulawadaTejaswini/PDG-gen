import java.util.*;


public class Main {

    private static int K;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        LinkedList<Integer> s = new LinkedList<>();
        s.add(0);
        long ans = dfs(s, 0, true);
        System.out.println(ans);
    }

    private static long dfs(LinkedList<Integer> s, int digit, boolean allZero) {
        long ret = 0;
        if (digit == 10) {
            if (K-- == 0) {
                for (int ss : s) {
                    ret *= 10;
                    ret += ss;
                }
            }
            return ret;
        }

        int last = s.getLast();
        for (int i = 0; i <= 9; i++) {
            if (allZero || -1 <= i-last && i-last <= 1) {
                s.add(i);
                ret = dfs(s, digit+1, allZero && i == 0);
                if (ret > 0) {
                    break;
                }
                s.removeLast();
            }
        }

        return ret;
    }
}
