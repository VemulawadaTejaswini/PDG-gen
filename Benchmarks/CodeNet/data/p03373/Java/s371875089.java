import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int more = X > Y ? X : Y;
        int less = X < Y ? X : Y;
        int diff = more - less;
        int sum = 0;

        if ((A + B) > 2 * C) {
            sum += 2 * C * less;
        } else {
            sum += A * less + B * less;
        }

        if (X > Y) {
            if (A < 2 * C) {
                sum += diff * A;
            } else {
                sum += 2 * C * diff;
            }
        } else {
            if (B < 2 * C) {
                sum += diff * B;
            } else {
                sum += 2 * C * diff;
            }
        }

        System.out.println(sum);
    }
}

