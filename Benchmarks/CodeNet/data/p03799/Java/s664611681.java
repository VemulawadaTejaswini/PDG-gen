import java.util.Scanner;

/**
 * Created by zzt on 17-2-18.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();

        if (n*2>=m)
            System.out.println(m/2);
        else {
            long r = m-n*2;
            System.out.println(n+r/4);
        }
    }
}