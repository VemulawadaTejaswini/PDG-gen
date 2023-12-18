import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.io.IOException;

class MyScanner {
    BufferedReader br;

    MyScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public int intLine() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    public String line() throws IOException {
        return br.readLine();
    }

    public int[] intArray() throws IOException {
        String[] in = br.readLine().split(" ");
        int n = in.length;
        int[] res = new int[n];
        for(int i = 0; i < n; i++) {
            res[i] = Integer.parseInt(in[i]);
        }
        return res;
    }
}

class Pair implements Comparable<Pair> {
    long t;
    int i;

    Pair(long t, int i) {
        this.t = t;
        this.i = i;
    }

    public int compareTo(Pair p) {
        return t > p.t? 1 : -1;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        MyScanner sc = new MyScanner();

        int n = sc.intLine();
        int[] a = sc.intArray();

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i < n; i++) {
            if(map.containsKey(a[i])) map.put(a[i], map.get(a[i]) + 1);
            else map.put(a[i], 1);
        }

        int[] tmp = new int[n];
        boolean flag = false;
        tmp[0] = a[0];
        for(int i = 1; i < n; i++) {
            Map<Integer, Integer> removed = new HashMap<>();
            Set<Integer> set = map.keySet();
            for(Integer j : set) {
                removed.put(j, 0);
            }
            tmp[1] = a[i];
            
            boolean flag2 = true;
            for(int j = 2; j < n; j++) {
                int need = tmp[j - 2] ^ tmp[j - 1];
                if(!removed.containsKey(need)) {
                    flag2 = false;
                    break;
                }
                int total = removed.get(need) + 1;
                if(total <= map.get(need)) {
                    removed.put(need, total);
                    tmp[j] = need;
                }else {
                    flag2 = false;
                    break;
                }
            }
            if(flag2) {
                if((tmp[n - 2] ^ tmp[n - 1]) != tmp[0]) flag2 = false;
                if((tmp[n - 1] ^ tmp[0]) != tmp[1]) flag2 = false;
            }
            if(flag2) {
                flag = true;
                break;
            }
        }

        System.out.println(flag? "Yes" : "No");

        sc.br.close();
    }
}