import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] alp = new boolean[26];
        for (int i = 0; i < 26; i++) {
            alp[i] = false;
        }
        boolean f = true;
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            if(alp[s.charAt(i)-'a']){
                f = false;
                break;
            }
            alp[s.charAt(i)-'a'] = true;
        }
        io.yesno(f);
        sc.close();
    }
}

class io {
    public static void br() {
        System.out.println("");
    }

    public static void yesno(boolean f) {
        System.out.println(f ? "yes" : "no");
    }

    public static void YesNo(boolean f) {
        System.out.println(f ? "Yes" : "No");
    }

    public static void YESNO(boolean f) {
        System.out.println(f ? "YES" : "NO");
    }

}

class Algo {
    public static int nibutan(int target, int[] ar) {
        // ar[i] >= target なる最小のiを探す
        int res;
        int high = ar.length;
        int low = 0;
        while (high > low) {
            res = (high + low) / 2;
            if (ar[res] < target) {
                // ↑↓ここを変える
                low = res + 1;
            } else {
                // ↓ここを変える
                high = res;
            }
        }
        return low;
    }

    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }


}

