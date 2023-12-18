import java.util.Scanner;

public class Main {

    public static boolean isPrime(int source) {
        for (int i = 2; i < source; i++) {
            if (source % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int p = Integer.parseInt(sc.next());
        while(isPrime(p)) {
            p++;
        }

        System.out.println(p);
    }
}
