import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        String s = sc.nextLine();
        int halfLength = s.length() / 2 - 1;
        while(true) {
            String prefix= s.substring(0, halfLength);
            if (s.startsWith(prefix, halfLength)) {
                System.out.println(halfLength * 2);
                return;
            }
            halfLength--;
        }
    }
}