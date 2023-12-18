import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long r = (long)Math.sqrt(n);
        while (true) {
            if (n % r == 0) {
                break;
            }
            r++;
        }
        System.out.println(String.valueOf(r).length());
    }
}