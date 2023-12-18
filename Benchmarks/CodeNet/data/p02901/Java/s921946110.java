
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long sum = 0;
        ArrayList<Key> keys = new ArrayList<Key>();
        int[] w = new int[N];
        for (int i = 0; i < M; i++) {
            int value = sc.nextInt();
            int size = sc.nextInt();
            Key key = new Key(value);
            sum += value;
            for (int k = 0; k < size; k++) {
                int t = sc.nextInt() - 1;
                w[t]++;
                key.accept.add(t);
            }
            keys.add(key);
        }
        for(int i=0;i<N;i++){
            if(w[i]<=0){
                System.out.println(-1);
                return;
            }
        }
        long ans = solve(0, w, sum, keys);
        System.out.println(ans);
    }

    private static long solve(int target, int[] w, long sum, ArrayList<Key> keys){
        if(target>=keys.size())return sum;
        int[] cp = w.clone();
        Key tk = keys.get(target);
        boolean rem = true;
        for(int k:tk.accept){
            cp[k]--;
            if(cp[k]<=0){
                rem=false;
                break;
            }
        }
        if(rem){
            return Math.min(solve(target+1,cp,sum-tk.value,keys),solve(target+1,w,sum,keys));
        }else{
            return solve(target+1,w,sum,keys);
        }
    }
}

class Key {
    ArrayList<Integer> accept = new ArrayList<Integer>();
    int value;

    Key(int value) {
        this.value = value;
    }

}