import java.util.*;

public class a {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();

        long ret = solver(str);
        System.out.println(ret);
        return;
    }

    private static long solver(String s) {
        return s.chars().filter(c -> '+' == c).count() - s.chars().filter(c -> '-' == c).count();
    }
}
