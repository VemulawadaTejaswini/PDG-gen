import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    Main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i=1; i < s.length(); i++) {
            String a = s.substring(0, (s.length()-i)/2);
            String b = s.substring((s.length()-i)/2,s.length()-i);
            if(a.equals(b)){
                System.err.println(a);
                System.out.println(s.length()-i);
                return;
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
