import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
//        int t = scr.nextInt();
//        while (t-- > 0)
        solve(scr);
    }


    static void solve(Scanner scr) {
        String str = scr.next();
        System.out.println(isP(str) && isP(str.substring(0, (str.length() - 1) / 2)) && isP(str.substring((str.length()) / 2 + 1))?"Yes":"No");

    }

    static boolean isP(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) return false;

        }
        return true;
    }


}



