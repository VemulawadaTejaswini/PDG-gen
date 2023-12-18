import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(Math.max((n - 2) * b - (n - 2) * a + 1, 0));
    }

}
