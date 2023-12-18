import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        HashMap<Integer,ArrayList<Work>> arr = new HashMap<Integer,ArrayList<Work>>();
        // ArrayList<Work> list = new ArrayList<Work>();
        for (int i = 0; i < N; i++) {
            int d = sc.nextInt();
            int v = sc.nextInt();
            // list.add(new Work(d, v));
            if (arr.get(d) == null) {
                arr.put(d, new ArrayList<Work>());
            }
            arr.get(d).add(new Work(d, v));
        }

        // for (int i = 0; i <= 100000; i++) {
        //     if (arr.get(i) == null)
        //         continue;
        //     Collections.sort(arr.get(i));
        // }
        // Collections.sort(list);

        long ans = 0;
        int limit = M;
        // System.out.println();
        ArrayList<Work> list = new ArrayList<Work>();
        for (int i = 1; i <= M; i++) {
            if (arr.get(i) != null) {
                list.addAll(arr.get(i));
            }
            Collections.sort(list);
            if(!list.isEmpty()){
                ans+=list.get(0).v;
                list.remove(0);
            }
        }
        System.out.println(ans);
    }
}

class Work implements Comparable {
    int d;
    int v;

    Work(int d, int v) {
        this.d = d;
        this.v = v;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Work))
            return 0;
        Work one = this;
        Work two = (Work) o;
        return two.v - one.v;
        // if (one.d == two.d) {
        // // if (one.v != two.v) {
        // return one.v - two.v;
        // // return two.v - one.v;
        // } else {
        // // return two.d - one.d;
        // return two.v - one.v;
        // }
    }

    @Override
    public String toString() {
        return d + " " + v;
    }
}