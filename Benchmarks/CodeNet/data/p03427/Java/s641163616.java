import java.util.Scanner;
import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long val = String.valueOf(N).length() - 1;
        long ch = 0;
        for (int i = 0; i <= val; i++) {
            ch = ch + N / (long) (Math.pow(10, i)) % 10;
        }
        N = N - (long) (Math.pow(10, val));
        N = N / (long) (Math.pow(10, val));
        for (int i = 1; i <= val; i++) {
            N = N + 9;
        }
        if (ch > N) {
            System.out.println(ch);
        } else {
            System.out.println(N);
        }
    }
}
