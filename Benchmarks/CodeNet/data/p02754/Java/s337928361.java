import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long A = scanner.nextLong();
        long B = scanner.nextLong();

        long sho = N / (A + B);
        long jouyo = N % (A + B);
        System.out.println(sho * A + jouyo);
    }
}
