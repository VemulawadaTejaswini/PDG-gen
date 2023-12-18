import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int res = 0;
        for (int i = 0; i < (s.length()-1)/2; i++) {
            StringBuffer t = new StringBuffer();
            t.append(s.substring(0,i+1));
            t.append(s.substring(0,i+1));
            if(s.indexOf(t.toString()) == 0){
                res = t.length();
            }
        }
        System.out.println(res);
        sc.close();
    }
}

class io {
    public static void br() {
        System.out.println("");
    }

    public static void YesNo(boolean f) {
        System.out.println(f ? "Yes" : "No");
    }

    public static void YESNO(boolean f) {
        System.out.println(f ? "YES" : "NO");
    }

}

class Algo {
    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }


}

