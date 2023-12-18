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
        int K = sc.nextInt();
        int[] sunuke = new int[N];
        for(int k=0;k<K;k++){
            int d = sc.nextInt();
            for(int i=0;i<d;i++){
                sunuke[sc.nextInt()-1]++;
            }
        }
        for(int i=0;i<N;i++){
            if(sunuke[i]==0)ans++;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main();
    }
}
