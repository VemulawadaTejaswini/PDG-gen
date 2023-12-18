import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean ok = false;
        int sum = 0;
        loop: for (int i = 0; i <= N / 4; i++) {
            for (int j = 0; j <= N / 7; j++) {

                if (4 * i + 7 * j == N) {
                    ok = true;
                    break loop;
                }
            }
        }
        if (ok) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}