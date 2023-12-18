import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        int fh = Integer.parseInt("" + s.charAt(0) + s.charAt(1));
        int sh = Integer.parseInt("" + s.charAt(2) + s.charAt(3));
        String ans;
        if (fh >= 0 && fh < 100 && sh > 0 && sh < 13) {
            if (sh >= 0 && sh < 100 && fh > 0 && fh < 13) {
                ans = "AMBIGUOUS";
            } else {
                ans = "YYMM";
            }
        } else if (sh >= 0 && sh < 100 && fh > 0 && fh < 13) {
            ans = "MMYY";
        } else {
            ans = "NA";
        }
        System.out.println(ans);
    }

}
