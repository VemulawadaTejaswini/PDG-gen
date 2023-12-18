import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(Math.max(a, b), c);
        int x = max * 3 - a - b - c;
        if (x % 2 == 0)
            System.out.println(x / 2);
        else
            System.out.println((x + 1) / 2 + 1);
    }
}
