import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        sc.close();

        long result = 0;
        for (long num = a; num <= b; num++) {
            result = result ^ num;
        }
        System.out.println(result);
    }
}
