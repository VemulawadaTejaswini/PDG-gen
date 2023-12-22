import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        long m = sc.nextInt();
        long n2 = sc.nextInt();
        long m2 = sc.nextInt();
        long t = sc.nextInt();

        if (Math.abs(n - n2) < (m - m2) * t) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }

}