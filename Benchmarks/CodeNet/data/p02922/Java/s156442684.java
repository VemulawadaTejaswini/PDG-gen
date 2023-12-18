import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int ans = 1;
        int cnt = 0;
        cnt = b - a;
        if (cnt <= 0) {
            System.out.println(ans);
        } else {
            while (cnt > 0) {
                cnt = cnt - a - 1;
                ans++;
            }
            System.out.println(ans);
        }
    }
}