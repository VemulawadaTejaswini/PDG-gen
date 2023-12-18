import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextInt();
        long A = scanner.nextInt();
        long B = scanner.nextInt();
        System.out.println(N/(A+B)*A+N%(A+B));
    }

}
