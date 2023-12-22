import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);

        while (true) {
            int n = inScanner.nextInt();

            for (int i = 0; i < n; i++) {
                int y = inScanner.nextInt();
                int m = inScanner.nextInt();
                int d = inScanner.nextInt();

                int ans = 0;
                for (int j = y+1; j < 1000; j++) {
                    if (j % 3 == 0)
                        ans += 200;
                    else
                        ans += 195;
                }
                for (int j = m+1; j <= 10; j++) {
                    if (j % 2 == 0)
                        ans += 19;
                    else
                        ans += 20;
                }
                if (y%3==0) {
                    for (int j = d; j <= 20; j++) {

                    }
                }
                else {
                    if (m%2 == 0) {
                        for (int j = d; j <= 19; j++) {
                            ans++;
                        }
                    }
                    else {
                        if (m%2 == 0) {
                            for (int j = d; j <= 20; j++) {
                                ans++;
                            }
                        }
                    }
                }
                System.out.println(ans);
            }
        }
    }
}