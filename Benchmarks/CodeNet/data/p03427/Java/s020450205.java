import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long N = scanner.nextLong();
        scanner.close();

        // 桁数
        String s = String.valueOf(N);
        int length = s.length();
        int c = Integer.valueOf(s.substring(0, 1));

        System.out.println((c - 1) + 9 * (length - 1));
    }
}
