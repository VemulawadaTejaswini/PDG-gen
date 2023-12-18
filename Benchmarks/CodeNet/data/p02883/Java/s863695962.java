import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.HashSet;
import java.util.HashMap;

public class Main {

    static long gcd(long p, long q) { if(q == 0) return p; return gcd(q, p % q);}
    static Scanner sc = new Scanner(System.in);
    /////////

    static int N, K;
    static ArrayList<Long> A = new ArrayList<>();
    static ArrayList<Long> F = new ArrayList<>();

    static boolean check(long mid) {
        long needs = 0;

        for(int i = 0; i < N; i++) {
            if(A.get(i) * F.get(i) <= mid) continue;
            /*
            if A[i] * F[i] > mid
            (A[i] - x) * F[i] <= mid 가 되는 최소 x
            A[i] - x <= mid / F[i]
            A[i] - mid / F[i] <= x
            Ceil(A[i] - mid / F[i])

             */
            needs += (long)Math.ceil(A.get(i) - (double)mid / F.get(i));
        }

        if(needs <= K) return true;
        else return false;

    }

    static long parametric_search(long l, long r) {
        if(r < l) return Long.MAX_VALUE;
        long mid = l + (r - l) / 2;

        if(check(mid)) {
            return Math.min(mid, parametric_search(l, mid - 1));
        } else {
            return parametric_search(mid + 1, r);
        }
    }


    public static void main(String[] args) {
        N = sc.nextInt(); K = sc.nextInt();

        for(int i = 0; i < N; i++) {
            A.add(sc.nextLong());
        }

        for(int i = 0; i < N; i++) {
            F.add(sc.nextLong());
        }

        A = A.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
        F = F.stream().sorted(Collections.reverseOrder()).collect(Collectors.toCollection(ArrayList::new));

        System.out.println(parametric_search(0, Long.MAX_VALUE));
        //System.out.println(parametric_search(12, 12));

    }
}
//[B@25618e91
//[B@326de728
//