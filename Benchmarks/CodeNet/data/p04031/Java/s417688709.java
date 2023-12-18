import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;

        long[] A;


        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            A = new long[N];
            for (int i = 0; i < A.length; i++) {
                A[i] = sc.nextLong();

            }

        }
        long result = 0;
        long sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        long average = Math.round((double)sum / N);
        for (int i = 0; i < A.length; i++) {
            result += (average - A[i]) * (average - A[i]);
        }

        System.out.println(result);
    }


}
