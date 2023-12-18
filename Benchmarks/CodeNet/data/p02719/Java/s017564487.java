import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long K = Long.parseLong(sc.next());

        long value = N - (N/K) * K;

        if (value < 0) {
            value = -value;
        }

        System.out.println(value);
    }
}


