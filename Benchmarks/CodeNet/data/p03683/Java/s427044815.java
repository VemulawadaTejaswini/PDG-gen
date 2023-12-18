import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        sc.close();

        int abs = (int)Math.abs(n - m);
        long count = 1;
        if (abs > 1) {
            System.out.println("0");
            System.exit(0);
        } else {
            while (n != 1) {
                count = count * n % (long)(Math.pow(10, 9) + 7);
                n--;
            }
            while (m != 1) {
                count = count * m % (long)(Math.pow(10, 9) + 7);
                m--;
            }
        }

        if (abs == 0) System.out.println((int)count * 2 % (long)(Math.pow(10, 9) + 7));
        else System.out.println((int)count);
    }
}
