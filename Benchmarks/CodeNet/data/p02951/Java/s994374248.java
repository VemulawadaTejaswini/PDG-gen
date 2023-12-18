import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        a -= b;
        c -= a;
        int ans = c < 0 ? 0 : c;
        System.out.println(ans);
    }
}
