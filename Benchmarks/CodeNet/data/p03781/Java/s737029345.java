import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            long X = in.nextInt();
            long sum = 0;
            int i = 1;
            for (; sum < X; i++) {
                sum += i;
            }
            System.out.println(i);
        }
    }
}
