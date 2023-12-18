import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int W = sc.nextInt();
        int H = sc.nextInt();
        int N = sc.nextInt();

        int left = 0;
        int right = W;
        int top = H;
        int down = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();

            if (a == 1 && left < x) {
                left = x;
            } else if (a == 2 && right > x) {
                right = x;
            } else if (a == 3 && down < y) {
                down = y;
            } else if (a == 4 && top > y) {
                top = y;
            }
        }

        if ((right - left) < 0 || (top - down) < 0) {
            System.out.println(0);
        } else {
            System.out.println((right - left) * (top - down));
        }
        sc.close();
    }
}