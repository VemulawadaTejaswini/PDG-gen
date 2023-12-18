import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(value(N,K));
    }

    public static int value(int N, int K) {
        int value = N - K;

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


