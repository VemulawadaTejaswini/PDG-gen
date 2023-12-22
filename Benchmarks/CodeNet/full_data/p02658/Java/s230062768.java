import java.text.DecimalFormat;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.io.*;
import java.util.*;
import java.util.List;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N;
        long[] A;
        N = sc.nextInt();
        A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        final long MAX_VALUE = (long) Math.pow(10, 18);
        long result = 1;

        if (hasZero(A)) {
            System.out.println(0);
        } else {
            for (int i = 0; i < N; i++) {
                result *= A[i];
                if (result > MAX_VALUE) {
                    System.out.println(-1);
                    break;
                }
            }
            if (result <= MAX_VALUE) {
                System.out.println(result);
            }
        }
        sc.close();
    }

    static boolean hasZero(long[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                return true;
            }
        }
        return false;

    }

}