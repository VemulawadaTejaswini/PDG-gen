import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(abc057_c(sc.nextInt()));
    }

    static int abc057_c(final long N) {
        int F = Integer.MAX_VALUE;
        for (long i = 1; i < N + 1; i++) {
            if (N % i != 0) continue;
            for (long j = i; j < N + 1; j++) {
                if (N % j != 0) continue;
                if (N == i * j) {
                    //System.out.println("a " + i + ", b " + j);
                    //list.add(new AB(i, j));
                    int tmpF = getF(i, j);
                    if (tmpF < F) {
                        F = tmpF;
                    }
                }
            }
        }
        //System.out.println("F:" + F);
        return F;
    }

    static int getF(long aa, long bb) {
        String a = String.valueOf(aa);
        String b = String.valueOf(bb);
        if (a.length() > b.length()) {
            return a.length();
        } else {
            return b.length();
        }
    }

}
