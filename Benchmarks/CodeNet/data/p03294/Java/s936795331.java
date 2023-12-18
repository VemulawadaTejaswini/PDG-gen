import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (sc.hasNext()) {
            ans += sc.nextInt() - 1;
        }
        System.out.println(ans);
    }
}