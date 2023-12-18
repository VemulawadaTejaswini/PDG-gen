import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String S = scan.next();
        scan.close();

        int ans = 1000;
        int s;

        for (int i = 0; i < S.length() - 2; i++) {
            s = Math.abs(Integer.parseInt(S.substring(i, i + 3)) - 753);
            if (s < ans) {
                ans = s;
            }
        }
        System.out.println(ans);
    }
}