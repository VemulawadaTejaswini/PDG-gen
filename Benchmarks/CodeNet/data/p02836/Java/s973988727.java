import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int cnt = 0;
            String input = sc.next();
            int halfLength = input.length() / 2;
            for (int i = 0; i < halfLength; i++) {
                char c1 = input.charAt(i);
                char c2 = input.charAt(input.length() - 1 - i);
                if (c1 != c2)
                    cnt++;
            }
            System.out.println(cnt);
        }
    }
}