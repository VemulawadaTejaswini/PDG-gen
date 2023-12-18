import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int ans = 0;
        if (x == 1 && y == 1) {
            ans += 400000;
        }
        if (x == 1) {
            ans += 300000;
        } else if (x == 2) {
            ans += 200000;
        } else if (x == 3) {
            ans += 100000;
        }
        if (y == 1) {
            ans += 300000;
        } else if (y == 2) {
            ans += 200000;
        } else if (y == 3) {
            ans += 100000;
        }
        System.out.println(ans);
    }
}