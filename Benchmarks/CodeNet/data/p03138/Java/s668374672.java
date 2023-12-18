
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        long k = sc.nextLong();
        int sqrt = (int) Math.floor(Math.sqrt(k));
        long[] answer = new long[sqrt];
        if (sqrt == 0) {
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sc.nextLong();
            }
            System.out.println(sum);
        } else {
            for (int i = 0; i < n; i++) {
                long temp = sc.nextLong();
                long max = 1;

                for (int j = 0; j < sqrt; j++) {
                    max *= 2;
                    if (temp < max) {
                        answer[j] += temp + max;
                    } else if (temp > max) {
                        answer[j] += temp - max;
                    }
                }
            }
            Arrays.sort(answer);
            System.out.println(answer[sqrt - 1]);
        }

    }
}
