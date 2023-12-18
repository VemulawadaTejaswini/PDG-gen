import java.util.Scanner;

public class main {
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
            if (S.charAt(pos) == S.charAt(pos - 1)) {
                count++;
                i++;
            }
        }

        return count;
    }
}
