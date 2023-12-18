import java.util.Scanner;

public class Main {
    static void findNumberOfDigits(long n, int base) {

        int dig = (int)(Math.floor(
                Math.log(n) / Math.log(base))
                + 1);
        System.out.println(dig);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int base = sc.nextInt();


        findNumberOfDigits(n, base);

    }
}