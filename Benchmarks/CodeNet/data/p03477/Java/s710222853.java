import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ab = scanner.nextInt() + scanner.nextInt();
        int cd = scanner.nextInt() + scanner.nextInt();

        System.out.println((ab > cd) ? "Left" : (ab == cd) ? "Balanced" : "Right" );

    }
}
