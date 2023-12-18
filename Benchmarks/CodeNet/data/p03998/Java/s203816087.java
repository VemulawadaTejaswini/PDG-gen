import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String C = sc.next();
        String t = A;
        while (true) {
            if (t == A) {
                if (t.length() == 0) {
                    System.out.println("A");
                    return;
                }
                A = A.substring(1);
            } else if (t == B) {
                if (t.length() == 0) {
                    System.out.println("B");
                    return;
                }
                B = B.substring(1);
            } else {
                if (t.length() == 0) {
                    System.out.println("C");
                    return;
                }
                C = C.substring(1);
            }
            // System.out.println(A+" "+B+" "+C);
            // System.out.println(t.charAt(0));
            t = (t.charAt(0) == 'a') ? A : ((t.charAt(0) == 'b') ? B : C);
        }
    }
}
