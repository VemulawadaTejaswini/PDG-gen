import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void swap(int x, int y) {
        int tmp = x;
        x = y;
        y = tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String w = sc.next();
        int ans = 0;
        while (true) {
            String t = sc.next();
            if (t.equals("END_OF_TEXT")) {
                break;
            }
            if (t.equalsIgnoreCase(w)) {
                ans++;
            }
        }

        System.out.println(ans);

        sc.close();
    }
}
