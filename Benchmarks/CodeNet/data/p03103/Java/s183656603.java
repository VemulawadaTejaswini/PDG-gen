//package Beginner121;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        ArrayList<pair> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new pair(s.nextInt(), s.nextInt()));
        }

        Collections.sort(arr);

        long ans = 0;
        int i = 0;
        while(m != 0) {
            pair p = arr.get(i);
            if(p.quan >= m) {
                ans += (long) p.val * (long)m;
                m = 0;
            } else {
                ans += (long) p.val * (long)p.quan;
                m -= p.quan;
            }
            i++;
        }

        System.out.println(ans);
    }

    private static class pair implements Comparable<pair>{
        int val;
        int quan;

        @Override
        public String toString() {
            return this.val + " " + this.quan;
        }

        public pair(int val, int quan) {
            this.val = val;
            this.quan = quan;
        }

        @Override
        public int compareTo(pair o) {
            return Integer.compare(this.val, o.val);
        }
    }
}
