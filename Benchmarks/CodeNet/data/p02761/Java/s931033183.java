import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] s = new int[n];

        for(int i = 0; i < m; ++i) {
            int sIndex = Integer.parseInt(sc.next()) - 1;
            int sNumber = Integer.parseInt(sc.next());
            s[sIndex] = (s[sIndex] == 0) ? sNumber : 
            (sNumber != s[sIndex]) ? -1 : sNumber;
        }

        // System.out.println("s = " + Arrays.toString(s));
        
        if(hasNegative(s) || s[0] < 1) {
            System.out.println(-1);
            return;
        }

        for(int i = 0; i < 1000; ++i) {
            String iStr = String.valueOf(i);
            if(iStr.length() < n) {
                continue;
            }

            if(iStr.length() > n) {
                break;
            }

            if(isValidNumber(iStr, s)) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);

    }

    static boolean hasNegative(int[] s) {
        for(int i = 0, f = s.length; i < f; ++i) {
            if(s[i] < 0) {
                return true;
            }
        }
        return false;
    }

    static boolean isValidNumber(String iStr, int[] s) {
        for(int j = 0, f = s.length; j < f; ++j) {
            if(s[j] == 0) {
                continue;
            }

            if((iStr.charAt(j) - '0') != s[j]) {
                // System.out.println("j = " + j);
                // System.out.println("istr = " + iStr + ", s = " + Arrays.toString(s));
                return false;
            }
        }
        return true;
    }
}