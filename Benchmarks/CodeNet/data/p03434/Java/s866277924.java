import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] s = scanner.nextLine().split(" ");
        int an[] = new int[n];
        for (int i = 0; i < n; i++) {
            an[i] = Integer.parseInt(s[i]);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j > 0; j--) {
                if (an[j] > an[j + 1]) {
                    int tmp = an[j];
                    an[j] = an[j + 1];
                    an[j + 1] = tmp;
                }
            }
        }
        int diff = 0;
        for (int i = 0; i < n - 1; i += 2) {
            diff += an[i] - an[i + 1];
        }
        if (n % 2 == 1) {
            diff += an[n - 1];
        }

        System.out.println(diff);
        scanner.close();
    }
}
