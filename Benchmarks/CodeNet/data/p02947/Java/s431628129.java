import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        Map<Map<Character, Integer>, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String str = sc.line();
            Map<Character, Integer> key = new HashMap<>();
            for(int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(key.containsKey(c)) key.put(c, key.get(c) + 1);
                else key.put(c, 1);
            }
            if(map.containsKey(key)) map.put(key, map.get(key) + 1);
            else map.put(key, 1);
        }

        long ans = 0;
        Set<Map<Character, Integer>> set = map.keySet();
        for(Map<Character, Integer> k : set) {
            int tmp = map.get(k);
            ans += (long)tmp * (tmp - 1) / 2;
        }
        
        System.out.println(ans);

        sc.br.close();
    }
}
