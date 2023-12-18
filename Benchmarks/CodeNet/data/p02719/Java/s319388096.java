import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        value(N,K);
    }

    public static int value(int N, int K) {
        int value = Math.abs(N - K);

        if (value >= N) {
            System.out.println(N);
        }

        else {
            return value(value, K);
        }

        return N;
    }
}


