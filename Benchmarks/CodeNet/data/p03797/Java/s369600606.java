import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        sc.close();

        long count = n;
        m = m - n * 2;
        count += m / 4;

        System.out.println(count);
    }
}