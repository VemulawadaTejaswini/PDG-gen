import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        System.out.println(scanner.next().replaceAll("[013-9]").length());
    }
}