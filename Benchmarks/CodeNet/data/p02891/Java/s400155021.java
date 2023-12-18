import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        long K = in.nextLong();
        in.close();

        System.out.println(findMinimumOperation(S, K));
//        assert(findMinimumOperation("issii", 2L) == 4);
//        assert(findMinimumOperation("qq", 81L) == 81);
//        assert(findMinimumOperation("cooooooooonteeeeeeeeeest", 999993333L) == 8999939997L);
    }

    static long findMinimumOperation(String S, long K) {
        int count = 0;

        for (int i = 1; i < K * S.length(); i++) {
            int pos = i % S.length();
            int pre = i - 1;
            pre = pre >= 0 ? pre : S.length() - 1;
            if (S.charAt(pos) == S.charAt(pre)) {
                count++;
                i++;
            }
        }

        return count;
    }
}
