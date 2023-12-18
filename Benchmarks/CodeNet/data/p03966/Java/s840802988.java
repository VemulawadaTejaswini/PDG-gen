import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long x, y;
        long x0, y0;
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        x0 = y0 = 1;
        for (int n0 = 0;n0<n;n0++) {
            x = sc.nextLong();
            y = sc.nextLong();

            for (int i=1;i<1e18;i++) {
                if (x0 <= x * i && y0 <= y * i) {
                    x0 = x * i;
                    y0 = y * i;
                    break;
                }
            }
        }

        System.out.println(y0 + x0);
    }
}
