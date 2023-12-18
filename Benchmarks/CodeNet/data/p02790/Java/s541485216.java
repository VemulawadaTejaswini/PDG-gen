import java.util.*;
 
public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder ans = new StringBuilder();
        if (a < b) {
            for (int i = 0; i < b; i++) {
                ans.append(a);
            }
        } else if (b < a) {
            for (int i = 0; i < a; i++) {
                ans.append(b);
            }
        } else {
            for (int i = 0; i < a; i++) {
                ans.append(a);
            }
        }

        System.out.println(ans.toString());
    }
}
