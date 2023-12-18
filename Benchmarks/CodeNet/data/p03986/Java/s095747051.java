import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        String x = scanner.next();
        System.out.println(Math.max(x.replaceFirst("S.*", "").length(), x.replaceFirst(".*T", "").length()) * 2);
    }
}