import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jouken = 0;

        while (jouken == 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int kazu = 0;
            if (n == 0 && x == 0) {
                break;
            }
            for (int i = 1; n >= i; i++) {
                for (int j = 1; n >= j; j++) {
                    for (int k = 1; n >= k; k++) {
                        int goukei = i + j + k;
                        if (i != k && k != j && j != i && goukei == x&&i>j&&j>k) {
                            kazu++;
                        }
                    }
                }
            }
            System.out.println(kazu);
        }
    }
}