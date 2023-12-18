import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            String S = in.next();

            int count = 1;
            for (int i = 1; i < N; i++) {
                if (S.charAt(i) != S.charAt(i - 1)) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
