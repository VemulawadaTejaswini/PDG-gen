import java.util.*;
 
public class Main {
    static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[]$) {
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt(), d = scanner.nextInt();
        System.out.println(Math.abs(a - b) <= d && Math.abs(b - c) <= d || Math.abs(a - c) <= d ? "Yes" : "No");
    }
}