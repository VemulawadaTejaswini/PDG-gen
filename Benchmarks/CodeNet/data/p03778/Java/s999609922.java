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

    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 1;
        int w = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int a = Math.min(p,q);
        int b = Math.max(p,q);
        if(b<=a+w){
            ans=0;
        }else{
            ans=b-a-w;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main();
    }
}
