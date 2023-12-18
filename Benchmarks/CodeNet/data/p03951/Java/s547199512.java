import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        if (s.equals(t)) {
            System.out.println(n);
            System.exit(0);
        }
        int ans = s.length() + t.length();
        int iter = 0;
        int rep = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == t.charAt(iter)) {
                rep++;
            } else {
                break;
            }
        }
        System.out.println(ans - rep);
    }

}
