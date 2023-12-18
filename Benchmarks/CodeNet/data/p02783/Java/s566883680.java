import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int h = scanner.nextInt();

        Main aa = new Main();
        aa.a(a, h);
    }

    int b;
    int k;
    int i;

    public int a(int a, int h) {
        k = h / a + 1;
        b = h - a;
        if (b <= 0) {
            return b;
        } else if (b >= 1) {
            for (i = 0; i < k; i++) {
                return b -= a;
            }
        }
        return b;
    }
}
