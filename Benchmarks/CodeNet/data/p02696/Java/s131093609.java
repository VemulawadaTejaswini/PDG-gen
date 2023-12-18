import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextLong();
        long n = sc.nextLong();

        if(b > n) {
            System.out.println((int)Math.floor(a * n / b));
        } else {
            System.out.println((int)Math.floor(a * (b - 1) / b));
        }

        sc.close();
    }

}