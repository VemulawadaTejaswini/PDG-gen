import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int ans = 0;
        for (int i = 1; i < 1000; i++) {
            ans += k;
            if (ans >= a && ans <= b) {
                System.out.println("OK");
                return;
            }
        }
        System.out.println("NG");
    }
}