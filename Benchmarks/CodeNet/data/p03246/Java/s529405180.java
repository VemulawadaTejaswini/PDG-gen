//package Regular103;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i+=2) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        pair[] ans = new pair[keys.size()];
        for (int i = 0; i < keys.size(); i++) {
            ans[i] = new pair(keys.get(i), map.get(keys.get(i)));
        }
        Arrays.sort(ans);

        map = new HashMap<>();
        for (int i = 1; i < n; i+=2) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        keys = new ArrayList<>(map.keySet());
        pair[] ans1 = new pair[keys.size()];
        for (int i = 0; i < keys.size(); i++) {
            ans1[i] = new pair(keys.get(i), map.get(keys.get(i)));
        }
        Arrays.sort(ans1);

        if(ans[0].key != ans1[0].key) {
            System.out.println(n- (ans[0].val +ans1[0].val));
        } else {
            if(n == 2) {
                if(arr[0] == arr[1]) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else {
                if(ans1.length >= 2 && ans.length >= 2) {
                    System.out.println(n - Math.max(ans[0].val + ans1[1].val, ans[1].val + ans1[0].val));
                } else if(ans.length == 1 && ans1.length == 1) {
                    System.out.println(Math.min(n/2, n - n/2));
                } else if(ans.length == 1) {
                    System.out.println(n - (ans1[1].val + ans[0].val));
                } else {
                    System.out.println(n - (ans[1].val + ans1[0].val));
                }
            }
        }

    }

    private static class pair implements Comparable<pair> {
        int val;
        int key;

        public pair(int key, int val) {
            this.key = key;
            this.val = val;
        }

        @Override
        public int compareTo(pair o) {
            return Integer.compare(this.val, o.val);
        }
    }
}