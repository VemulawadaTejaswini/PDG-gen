import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int price1 = Math.max(x, y) * 2 * c;
        int price2 = a * x + b * y;
        int price3;
        if (x > y)
            price3 = y * 2 * c + (x - y) * a;
        else
            price3 = x * 2 * c + (y - x) * b;
        System.out.println(Math.min(Math.min(price1, price2), price3));
    }
}
