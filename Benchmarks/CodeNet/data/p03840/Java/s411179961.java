import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long I = scanner.nextLong();
        long O = scanner.nextLong();
        long T = scanner.nextLong();
        long J = scanner.nextLong();
        long L = scanner.nextLong();
        long S = scanner.nextLong();
        long Z = scanner.nextLong();

        int mod = (int) (I%2+J%2+L%2);
        long result = I+O+J+L;
        System.out.println(result-mod%3);
    }
}