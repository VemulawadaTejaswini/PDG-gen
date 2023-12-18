import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b, c, x, y;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        long common = Math.min(x, y);
        long to = Math.min(a + b, 2 * c);
        long ans = to * common;
        x -= common;
        y -= common;
        ans += Math.min(x * a, x * 2 * c);
        ans += Math.min(y * b, y * 2 * c);
        System.out.print(ans);
    }
}
