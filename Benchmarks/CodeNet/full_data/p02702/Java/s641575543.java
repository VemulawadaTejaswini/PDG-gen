import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 2019;
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // 3 673
        int[] k = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            k[i] = (int) s.charAt(i) - '0';
        int tmp = 0;
        int pom = 1;
        int[] mem = new int[s.length()];
        int[] map = new int[MOD];
        tmp = 0;
        map[0]++;
        for (int i = 0; i < s.length(); i++) {
            tmp += k[s.length() - i - 1] * pom;
            tmp %= MOD;
            pom *= 10;
            pom %= MOD;
            mem[i] = tmp;
            map[tmp]++;
        }
        long ans = 0;
        for(int i=0;i<2019;i++){
            ans += map[i]*(map[i]-1)/2;
        }
        System.out.println(ans);
        System.err.println(Arrays.toString(mem));
    }

    public static void main(String[] args) {
        new Main();
    }
}
