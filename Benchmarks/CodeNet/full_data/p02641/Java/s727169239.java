import java.util.*;
import java.lang.Math;

public class Main {
//public static final int MIN_VALUE
//public static final int MAX_VALUE

/**
 * ソート済みの配列を2分探索し、indexを返す。
 * 見つからない場合は-1を返す
 * @param a
 * @param x
 * @return
 */
public static int indexOf(int[] a, int x) {
    int ret = -1;

    int l,m,r;
    l = 0;r = a.length - 1; 

    while(l <= r) {
        m = (l+r) / 2;
        if(a[m] == x) {
            ret = m;
            break;
        } else if(a[m] < x) {
            l = m + 1;
        } else {
            r = m - 1;
        }
    }

    return ret;
}

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x,n;
    int pos,cpos;
    int lcand,rcand;
    boolean found;

    x = scan.nextInt();
    n = scan.nextInt();

    if(n == 0) {
        System.out.println(x);
        scan.close();
        return;
    }

    int[] p = new int[n];
    for(int i=0;i<n;i++) {
        p[i] = scan.nextInt();
    } 

    Arrays.sort(p);

//    System.out.println(x);
//    for(int i=0;i<n;i++) {
//        System.out.println(p[i]);
//    }

    cpos = indexOf(p,x);
    if(cpos != -1) {
        // 見つかった場合、そこから左右に伸びていく
        pos = 0;
        
        while(true) {
            pos++;
            found = false;
            lcand = Integer.MIN_VALUE;
            rcand = Integer.MAX_VALUE;
            //左
            if((cpos - pos) < 0) {
                //範囲外
                lcand = x - pos;
                found = true;
            } else {
                if(p[cpos-pos] == (x - pos)) {
                } else {
                    lcand = x-pos;
                    found = true;
                }
            }

            //右
            if((cpos + pos) >= n) {
                // 範囲外
                rcand = x + pos;
                found = true;
            } else {
                if(p[cpos+pos] == (x + pos)) {
                } else {
                    rcand = x+pos;
                    found = true;
                }
            } 
            if(found) {
                if(Math.abs(x-rcand) < Math.abs(x-lcand)) {
                    System.out.println(rcand);
                } else {
                    System.out.println(lcand);
                }
                break;
            }
        }

    } else {
        
//        System.out.println("not found");
        System.out.println(x);
    }

    scan.close();

}

};
