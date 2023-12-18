import java.util.*;

public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int A = sc.nextInt();

        System.out.println((H+A-1)/A);
    }
}
