import java.util.*;

class PrintTestCases {
    public static void main(String...args) {
        final Scanner sc = new Scanner(System.in);
        for (int t = 1; ; t++) {
            final int x = sc.nextInt();
            if(x == 0)
                break;
            System.out.printf("Case %d: %d\n", t, x);
        }
    }
}
public class Main {
    public static void main(String... args) {
        PrintTestCases.main();
    }
}