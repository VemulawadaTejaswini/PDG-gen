import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String[] parts = s.split("/");

        int y = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int d = Integer.parseInt(parts[2]);

        if (y > 2019) {
            System.out.println("TBD");
            return;
        }

        if (m > 4) {
            System.out.println("TBD");
            return;
        }

        if (d > 30) {
            System.out.println("TBD");
            return;
        }

        System.out.println("Heisei");
    }
}