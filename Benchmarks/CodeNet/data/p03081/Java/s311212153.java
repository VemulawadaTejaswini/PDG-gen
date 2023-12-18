import java.util.*;
import java.util.stream.IntStream;

public class Main {
    static int n;
    static int q;
    static char[] s;
    static char[] t;
    static char[] d;
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        n = sc.nextInt();
        q = sc.nextInt();
        s = sc.next().toCharArray();
        t = new char[q];
        d = new char[q];
        for (int i = 0; i < q; i++) {
            t[i] = sc.next().charAt(0);
            d[i] = sc.next().charAt(0);
        }
        int lft = bsearchl()+1;
        if(!isOkl(0)) {
            lft = 0;
        }
        int rgt = bsearchr();
        if(!isOkr(n-1)) {
            rgt = n;
        }
        int sum = lft + (n - rgt);
        System.out.println(Math.max(0, n - sum));

    }
    static int bsearchl() {
        int lft = 0;
        int rgt = n;
        int mid = 0;
        while(rgt - lft > 1) {
            mid = (lft + rgt) / 2;
            if(isOkl(mid)) {
                lft = mid;
            }
            else {
                rgt = mid;
            }
        }
        return lft;
    }

    static boolean isOkl(int index) {
        for (int i = 0; i < q; i++) {
            if(index == -1) {
                return true;
            }
            if (index == n){
                return false;
            }
            if(t[i] == s[index]) {
                if(d[i] == 'L') {
                    index--;
                }
                else {
                    index++;
                }
            }
        }
        if(index == -1) {
            return true;
        }
        return false;
    }

    static int bsearchr() {
        int lft = -1;
        int rgt = n-1;
        int mid = 0;
        while(rgt - lft > 1) {
            mid = (lft + rgt) / 2;
            if(isOkr(mid)) {
                rgt = mid;
            }
            else {
                lft = mid;
            }
        }
        return rgt;
    }

    static boolean isOkr(int index) {
        for (int i = 0; i < q; i++) {
            if(index == n) {
                return true;
            }
            if(index == -1) {
                return false;
            }
            if(t[i] == s[index]) {
                if(d[i] == 'L') {
                    index--;
                }
                else {
                    index++;
                }
            }
        }
        if(index == n) {
            return true;
        }
        return false;
    }
}

