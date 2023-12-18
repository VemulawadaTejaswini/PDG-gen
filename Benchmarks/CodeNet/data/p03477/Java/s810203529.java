import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int l = scanner.nextInt() + scanner.nextInt();
        int r = scanner.nextInt() + scanner.nextInt();
        System.out.println(l == r ? "Balanced" : l > r ? "Left" : "Right");
    }
}