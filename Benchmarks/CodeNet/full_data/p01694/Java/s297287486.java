import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            int count = 0;

            if (n % 2 == 0) {
                for (int i = 0; i < n / 2; i++) {
                    if (sc.next().charAt(1) == sc.next().charAt(1)) {
                        count++;
                    }
                }
            } else {
                for (int i = 0; i < n; i++) {
                    if (n - i == 1) {
                        char temp = sc.next().charAt(1);
                    } else {
                        if (sc.next().charAt(1) == sc.next().charAt(1)) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}