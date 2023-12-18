import java.util.*;
 
public class Main {
    static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[]$) {
        int n = scanner.nextInt();
        System.out.println(n < 1000 ? String.format("ABC%03d", n) : String.format("ABD%03d", n - 999));
    }
}