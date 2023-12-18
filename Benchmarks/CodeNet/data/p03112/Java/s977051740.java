import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int Q = sc.nextInt();

        long[] s = new long[A + 2];
        s[0] = (long) - 1e12;
        s[A + 1] = (long) 1e12;
        for (int a = 0; a < A; a += 1) {
            s[a + 1] = Long.parseLong(sc.next());
        }
        long[] t = new long[B + 2];
        t[0] = (long) - 1e12;
        t[B + 1] = (long) 1e12;
        for (int b = 0; b < B; b += 1) {
            t[b + 1] = Long.parseLong(sc.next());
        }

        for (int q = 0; q < Q; q += 1) {
            long xq = Long.parseLong(sc.next());
            long eastS = east(s, xq);
            long westS = west(s, xq);
            long eastT = east(t, xq);
            long westT = west(t, xq);
            search(xq, eastS, westS, eastT, westT);
        }
    }


    private static void search(long x, long eastS, long westS, long eastT, long westT) {
        long sFirst;
        long sFirstE = search(x, eastS, eastT, westT);
        long sFirstW = search(x, westS, eastT, westT);
        if (sFirstE < sFirstW) {
            sFirst = sFirstE;
        } else {
            sFirst = sFirstW;
        }

        long tFirst;
        long tFirstE = search(x, eastT, eastS, westS);
        long tFirstW = search(x, westT, eastS, westS);
        if (tFirstE < tFirstW) {
            tFirst = tFirstE;
        } else {
            tFirst = tFirstW;
        }

        if (sFirst < tFirst) {
            System.out.println(sFirst);
        } else {
            System.out.println(tFirst);
        }
    }

    private static long search(long x, long first, long toE, long toW) {
        long dist = Math.abs(first - x);
        long toEast = Math.abs(toE - first);
        long toWest = Math.abs(toW - first);
        if (toEast < toWest) {
            return dist + toEast;
        } else {
            return dist + toWest;
        }
    }


    private static long east(long[] st, long x) {
        int index = Arrays.binarySearch(st, x);
        if (index < 0) {
            index = -(index + 1);
        }

        if (st[index] - x > 0) {
            return st[index - 1];
        } else {
            return st[index];
        }
    }

    private static long west(long[] st, long x) {
        int index = Arrays.binarySearch(st, x);
        if (index < 0) {
            index = -(index + 1);
        }

        if (st[index] - x < 0) {
            return st[index + 1];
        } else {
            return st[index];
        }
    }

}
