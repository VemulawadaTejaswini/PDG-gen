import java.util.*;

public final class Main {


    static int N;

    static long A;
    static long B;

    static long[] K;
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        N = s.nextInt();

        A = s.nextInt();

        B = s.nextInt();

        int max = 1;

        K = new long[N];

        for (int i = 0; i < N; i++) {

            int a = s.nextInt();

            K[i] = a;

            double ar = a;

            double  b = B;

            max = (int) Math.max(Math.floor(ar/b),max);
        }


        System.out.println(parametricSearch(0, max));

    }

    public static int parametricSearch(int start, int end) {

        if (end == start+1) return end;

        int middle = (start+ end) /2;

        if (can(K, middle)) {

            return parametricSearch(start,  middle);
        } else {

            return parametricSearch(middle, end);
        }
    }

    public static boolean can(long[] arr, long n) {

        long count = 0;

        for (int i = 0; i <arr.length; i++) {

            if (arr[i] - B*n <= 0) continue;

            long a  =arr[i]- B*n;

            long b = A-B;
            long k = a/b;

            if (a % b != 0) k++;

            count+=k;
        }


        return count <= n;

    }

}