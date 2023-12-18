import java.util.*;

public class Main {
    private static long f(long a) {
        if (a < 0) a = 0;

        long[] ret = new long[] {a, 1, a+1, 0};
        return ret[(int)(a % 4)];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in[];
        long a, b, ret;
        in = scanner.nextLine().split(" ");
        a = Long.parseLong(in[0]);
        b = Long.parseLong(in[1]);

        ret = f(b) ^ f(a-1);

        System.out.println(ret);
    }
}