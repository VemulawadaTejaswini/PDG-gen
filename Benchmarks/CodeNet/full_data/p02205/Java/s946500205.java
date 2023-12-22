import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextInt();
        long b = sc.nextInt();
        n %= 12;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a = a - b;
            } else {
                b = a + b;
            }
        }
        System.out.println(a + " " + b);
    }
}

