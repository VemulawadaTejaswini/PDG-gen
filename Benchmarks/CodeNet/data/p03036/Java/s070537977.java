import java.util.Scanner;

public class Main {
    static int r;
    static int d;
    static int x;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextInt();
        d = scanner.nextInt();
        x = scanner.nextInt();
        scanner.close();
    }


    public static void main(String args[]) {
        init();

        int s = r * x - d;
        int[] ans = new int[10];
        ans[0] = s;
        for(int i = 1; i < 10; i++) {
            s = r * s - d;
            ans[i] = s;
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(ans[i]);
        }

    }
}