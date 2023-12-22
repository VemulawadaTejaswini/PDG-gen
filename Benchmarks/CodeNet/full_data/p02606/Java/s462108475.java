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
        int L = sc.nextInt();
        int R = sc.nextInt();
        int D = sc.nextInt();
        for(int i=L;i<=R;i++){
            if(i%D==0)ans++;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main();
    }
}
