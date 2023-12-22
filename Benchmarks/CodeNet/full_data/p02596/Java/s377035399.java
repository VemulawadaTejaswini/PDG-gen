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
        int K = sc.nextInt();
        boolean[] map = new boolean[K+1];
        //if(K%2==0)
        //System.out.println("-1");
        //else{
            int initial = 7;
            if(K%7==0){
                System.out.println(1);
                return;
            }
            for(int i=2;true;i++){
                initial *=10;
                initial%=K;
                initial+=7;
                initial%=K;
                if(map[initial])break;
                if(initial==0){
                    System.out.println(i);
                    return;
                }
                map[initial]=true;
                // if(is(K*i)){
                //     System.out.println(String.valueOf(K*i).length());
                //     return;
                // }
            }
            System.out.println("-1");
        //}
    }

    private boolean is(long num){
        String s = String.valueOf(num);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='7')return false;
        }
        return true;
    }

    public static void main(String[] args) {
        new Main();
    }
}
