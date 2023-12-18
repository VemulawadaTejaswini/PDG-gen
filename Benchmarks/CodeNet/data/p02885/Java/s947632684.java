import java.util.Scanner;

/**
 * abc143_a
 */
public class abc143_a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(Math.max(0, (s.nextInt() - 2 * s.nextInt())));
        s.close();
    }
}