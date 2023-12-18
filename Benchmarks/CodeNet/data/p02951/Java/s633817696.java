import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = c;
        if (a - b > 0) {
            ans = c - (a - b);
        }
        if (ans < 0) {
            ans = 0;
        }
        System.out.println(ans);
        sc.close();
    }
}