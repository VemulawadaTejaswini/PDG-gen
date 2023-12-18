import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();

        for (int i0 = 0; i0 <= n && 10000 * i0 <= y; i0++) {
            for (int i1 = 0; i0 + i1 <= n && 10000 * i0 + 5000 * i1 <= y; i1++) {
                for (int i2 = 0; 10000 * i0 + 5000 * i1 + 1000 * i2 <= y && i0 + i1 + i2 <= n; i2++) {
                    if (10000 * i0 + 5000 * i1 + 1000 * i2 == y && i0 + i1 + i2 == n) {
                        System.out.println(String.format("%d %d %d", i0, i1, i2));
                        return;
                    }
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}
