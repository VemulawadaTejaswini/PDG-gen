import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        int NUM = 26;
        int BASE = 96;

        StringBuilder builder = new StringBuilder();
        while (n > NUM) {
            int val = (int) (n % NUM);
            long tmp = n / NUM;
            if (val == 0) {
                val = NUM;
                tmp -= 1;
            }
            builder.append((char) (BASE + val));
            n = tmp;
        }
        builder.append((char) (BASE + n));
        System.out.println(builder.reverse().toString());

    }
}