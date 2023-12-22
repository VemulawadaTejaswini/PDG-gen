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

    ArrayList<Wood> list = new ArrayList<Wood>();
    int K;
    int N;
    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        N = sc.nextInt();
        K = sc.nextInt();

        // PriorityQueue<Wood> queue = new
        // PriorityQueue<Wood>(Comparator.comparing(Wood::LEND));
        for (int i = 0; i < N; i++) {
            Wood w = new Wood(sc.nextInt());
            list.add(w);
            // queue.add(w);
        }
        /*
         * int cut = 0; while(true){ int remain = K-cut; Wood w = queue.poll();
         * if(w.COST() <= remain){ w.CUT(); queue.add(w); }else{ ans =
         * (long)Math.floor(w.LEND()); break; } }
         */

        ans = binarySearch(1, 1000000001);

        System.out.println(ans);
    }

    int binarySearch(int min, int max) {
        int ng = min - 1, ok = max;
        while (ok - ng > 1) {
            int mid = ng + (ok - ng) / 2;
            if (isOK(mid))
                ok = mid;
            else
                ng = mid;
        }
        if (ok == max)
            throw new Error("all false");
        return ok;
    }

    boolean isOK(int key) {
        long sum = 0;
        for (int i = 0; i < N; i++) {
            Wood w = list.get(i);
            if (w.length <= key)
                continue;
            //double col = (double)w.length / key;
            //sum += (w.length / key) - (((w.length % key) == 0) ? 1 : 0);
            int ck = (w.length / key);
            if((double)w.length/ck > key){
                //ck++;
            }else{
                ck--;
            }
            sum += ck;
            if (sum > K){
                //System.err.println(key+" is false " + sum);
                return false;
            }
        }
        //System.err.println(key+" is true "+sum);
        return true;
    }

    public static void main(String[] args) {
        new Main();
    }

    class Wood {
        int length;
        int cut;

        Wood(int length) {
            this.length = length;
            cut = 0;
        }

        void CUT() {
            cut += cut + 1;
        }

        int COST() {
            return cut + 1;
        }

        int LEN() {
            return length / (cut + 1);
        }

        double LEND() {
            return length / (cut + 1d);
        }
    }
}
