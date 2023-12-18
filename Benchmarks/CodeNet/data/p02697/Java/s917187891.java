import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt();
        if (n % 2 == 1) {
            int count = 0;
            for (int i = 1; i <= n /2 + 1 && count < m; i++) {
                System.out.println(i + " " + (n + 1 - i));
                count++;
            }
        } else {
            if ((n / 2) % 2 == 0) {
                int count = 0;
                for (int i = 1; i <= n /4 - 1 && count < m; i++) {
                    System.out.println(i + " " + (n/2 - i));
                    count++;
                }
                if (m > n / 4 - 1) {
                    for (int i = 1; i <= n /4 && count < m; i++) {
                        System.out.println((i + n / 2) + " " + (n + 1 - i));
                        count++;
                    }
                }
            } else {
                int count = 0;
                for (int i = 1; i <= n /4 && count < m; i++) {
                    System.out.println(i + " " + (n/2 - i));
                    count++;
                }
                if (m > n / 4) {
                    for (int i = 1; i <= n /4 && count < m; i++) {
                        System.out.println((i + n / 2) + " " + (n + 1 - i));
                        count++;
                    }
                }
            }
        }


    }


}
