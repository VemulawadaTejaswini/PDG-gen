import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);

        int n = inScanner.nextInt();

        for (int i = 0; i < n; i++) {
            int y = inScanner.nextInt();
            int m = inScanner.nextInt();
            int d = inScanner.nextInt();

            int ans = 0;
            while(true) {
                if (y == 1000) {
                    break;
                }

                ans++;

                // day
                d++;
                if (d == 20 && m%2 == 0 && y%3 != 0) {
                    d = 1;
                    m++;
                }
                else if (d == 21) {
                    d = 1;
                    m++;
                }

                // month
                if (m == 11) {
                    m = 1;
                    y++;
                }
            }

            System.out.println(ans);
        }
    }
}