import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextInt();
        long a = sc.nextInt();
        long b = sc.nextInt();
        long res = 0;

        long remainder = n % (a + b);
        if(remainder >= a) res += a;
        else res += remainder;

        res += (n / (a + b)) * a;
        System.out.println(res);
    }
}
