import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        long[] abcd = new long[4];
        try (Scanner s = new Scanner(System.in)) {
            for(int i = 0; i < 4; i++) {
                abcd[i] = s.nextLong();
            }
            System.out.println(max(abcd[0] * abcd[2], abcd[0] * abcd[3], abcd[1] * abcd[2], abcd[1] * abcd[3]));
        }
    }
    
    private static long max(long p, long q, long r, long s) {
        long m1 = Math.max(p, q);
        long m2 = Math.max(m1, r);
        return Math.max(m2, s);
    }
}
