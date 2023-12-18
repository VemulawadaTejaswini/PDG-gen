import java.util.*;

public class Main {
    public static void solve(int X) {
        int x = 0;
        for (int i = 0; i <= X; i++) {
            x += i;
            if (x >= X) {
                System.out.println(i);
                return;
            }

        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        solve(x);
    }
}
