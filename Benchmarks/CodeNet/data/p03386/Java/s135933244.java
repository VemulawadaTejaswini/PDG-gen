import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        if (b - a > k * 2) {
            System.out.println(a);
            System.out.println(a + 1);
            System.out.println(b - 1);
            System.out.println(b);
        } else {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        }
    }
}