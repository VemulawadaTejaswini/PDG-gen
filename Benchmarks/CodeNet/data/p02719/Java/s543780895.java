import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long K = Long.parseLong(sc.next());
        System.out.println(value(N,K));
    }

    public static long value(long N, long K) {
        long value = N - (N / K) * K;

        if (value < 0) {
            value = -value;
        }

        else {
            value = value;
        }


        if (value > N) {
            return N;
        }

        else {
            return value(value, K);
        }
    }
}


