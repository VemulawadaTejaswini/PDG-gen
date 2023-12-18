import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        double left = Math.sqrt(a) + Math.sqrt(b);
        double right = Math.sqrt(c);

        if (left < right) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");
    }

}