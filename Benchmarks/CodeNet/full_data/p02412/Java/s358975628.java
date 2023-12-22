import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            if (n == 0 && x == 0)
                break;

            int r = 0;
            for (int a = 1; a <= n; a++)
                for (int b = 1; b <= n; b++)
                    for (int c = 1; c <=n; c++)
                        if (a < b && b < c && a + b + c == x)
                            r++;
            System.out.println(r);
        }
    }
}

