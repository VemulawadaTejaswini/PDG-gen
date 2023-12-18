import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int a = Integer.parseInt(s.substring(0, 4));
        int b = Integer.parseInt(s.substring(5, 7));
        int c = Integer.parseInt(s.substring(8, 10));

        String ans = "";
        if (a*10000 + b*100 + c <= 20190430) ans = "Heisei";
        else ans = "TBD";

        System.out.println(ans);

        in.close();
    }
}