import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long xor = a;
        for (long i = a + 1; i <= b; i++) {
            xor ^= i;
        }
        System.out.println(xor);
    }

}
