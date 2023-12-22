import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();

        int count = 0;
        for (int i = 0; i < n - 1; ++i) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                ++count;
                ++i;
                continue;
            }
        }
        System.out.println(count);
    }
}

