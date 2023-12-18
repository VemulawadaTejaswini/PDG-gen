import java.util.Scanner;

public class Main {
    public static void main(final String[] args) throws Exception {

        final int[] ans = { 1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4,
                1, 51 };
        final Scanner scan = new Scanner(System.in);
        final String index = scan.nextLine();
        System.out.println(ans[Integer.parseInt(index) - 1]);
        scan.close();
    }
}