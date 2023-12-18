import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        int ans;
        if (x == y) {
            ans = x + y;
        } else if (x > y) {
            ans = x + (x - 1);
        } else {
            ans = y + (y - 1);
        }
        System.out.println(ans);
    }

}
