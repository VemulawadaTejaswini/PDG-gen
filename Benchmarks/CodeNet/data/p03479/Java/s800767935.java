import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            long X = in.nextLong();
            long Y = in.nextLong();

            int count = 0;
            for (; X <= Y;) {
                X <<= 1;
                count++;
            }

            System.out.println(count);
        }
    }
}
