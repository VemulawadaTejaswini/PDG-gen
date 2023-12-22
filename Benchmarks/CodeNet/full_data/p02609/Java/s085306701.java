import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int N = sc.nextInt();
        String bin = sc.next();
        char[] cin = bin.toCharArray();
        BigInteger BIG = new BigInteger(bin, 2);
        int POP = BIG.bitCount();

        // int CNT = 0;
        // System.err.println(BIG);
        BigInteger num = BIG;
        while (!num.equals(BigInteger.ZERO)) {
            num = num.mod(BigInteger.valueOf(num.bitCount()));
            // CNT++;
        }
        // System.err.println(CNT);

        // System.out.println(CNT);

        BigInteger[][] dds = new BigInteger[2][200001];
        BigInteger Cp = BigInteger.valueOf(POP + 1);
        BigInteger Cs = BigInteger.valueOf(POP - 1);

        if (Cs.compareTo(BigInteger.ZERO)<=0) {
            for (int i = 0; i < N; i++) {
                if (cin[i] == '0') {
                    System.out.println(func(BIG.add(BigInteger.ONE.shiftLeft(N - i - 1))));
                } else {
                    System.out.println(func(BIG.subtract(BigInteger.ONE.shiftLeft(N - i - 1))));
                }
            }
            return;
        }

        BigInteger pM = BIG.mod(Cp);
        BigInteger sM = BIG.mod(Cs);

        dds[0][0] = BigInteger.ONE.mod(Cp);
        dds[1][0] = BigInteger.ONE.mod(Cs);
        for (int i = 1; i <= 200000; i++) {
            dds[0][i] = dds[0][i - 1].multiply(BigInteger.valueOf(2)).mod(Cp);
            dds[1][i] = dds[0][i - 1].multiply(BigInteger.valueOf(2)).mod(Cs);
        }

        // System.err.println("prepared");

        for (int i = 0; i < N; i++) {
            if (cin[i] == '0') {
                // BigInteger xi = BIG.add(BigInteger.ONE.shiftLeft(N - i - 1));
                // System.err.println(xi+"%"+Cp+" = "+dds[0][N-i-1]);
                // int pop = POP + 1;
                System.out.println(1 + func(pM.add(dds[0][N - i - 1]).mod(Cp)));
            } else {
                // BigInteger xi = BIG.subtract(BigInteger.ONE.shiftLeft(N - i - 1));
                // System.err.println(xi+"%"+Cs+" = "+dds[1][N-i-1]);
                // System.err.println(sM.subtract(dds[1][N-i-1]).mod(Cs));
                // System.err.println(xi);
                // int pop = POP - 1;
                System.out.println(1 + func(sM.subtract(dds[1][N - i - 1]).mod(Cs)));
            }
        }
        // System.out.println(BIG);
        // System.out.println(xi);
    }

    int func(BigInteger num) {
        int ret = 0;
        while (!num.equals(BigInteger.ZERO)) {
            num = num.mod(BigInteger.valueOf(num.bitCount()));
            ret++;
        }
        return ret;
    }

    public static void main(String[] args) {
        new Main();
    }
}
