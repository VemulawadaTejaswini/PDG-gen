import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        sc.close();

        int ans = 0;
        if (A + B - C * 2 <= 0) {
            ans = A * X + B * Y;
        } else if (X < Y) {
            ans = C * X + B * (Y - X);
        } else {
            ans = C * Y * 2 + A * (X - Y);
        }

        System.out.println(ans);
    }
}