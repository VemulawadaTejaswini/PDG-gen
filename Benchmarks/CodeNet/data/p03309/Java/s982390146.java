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
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        long left = -10000000000l;
        long right = 10000000000l;
        // long preans = -1;
        while (true) {
            // long lv = calc(A, left);
            // long rv = calc(A, right);
            long m1 = (left*2+right)/3;
            long m2 = (left+right*2)/3;
            // System.err.println("m1 "+m1);
            // System.err.println("m2 "+m2);
            // long mv = calc(A, mid);
            
            long mv1 = calc(A, m1);
            long mv2 = calc(A, m2);

            if(mv1<mv2){
                right = m2;
            }else{
                left = m1;
            }

            if(m2-m1<=1){
                ans = Math.min(mv1, mv2);
                break;
            }
        }
        System.out.println(ans);
    }

    long calc(long[] A, long val) {
        long ret = 0;
        for (int i = 0; i < A.length; i++) {
            ret += Math.abs(A[i] - val - i);
        }
        return ret;
    }

    public static void main(String[] args) {
        new Main();
    }
}
