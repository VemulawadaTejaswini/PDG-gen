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
        int N = sc.nextInt();
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        int ans = 0;
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            String s = sc.next();
            map.put(s, map.getOrDefault(s, 0)-1);
        }
        for(int val:map.values()){
            ans = Math.max(ans,val);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main();
    }
}
