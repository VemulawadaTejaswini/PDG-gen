import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        sc.close();

        long count = 0;
        if (m >= n * 2) {
            count = n;
            m = m - n * 2;
            count += m / 4;
        } else {
            count += m / 2;
        }

        System.out.println(count);
    }
}