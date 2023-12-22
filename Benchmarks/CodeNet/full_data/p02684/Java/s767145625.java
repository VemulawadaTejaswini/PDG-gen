package com.atcoder.contest167.d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static long start=-1;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        long n = Long.parseLong(str[0]);
        long k = Long.parseLong(str[1]);
        List<Long> t = new ArrayList<Long>();
        t.add((long) 0);
        str = br.readLine().split(" ");
        for(int i=1; i<=n; ++i){
            t.add(Long.parseLong(str[i-1]));
        }
        boolean[] vis = new boolean[(int) (n+1)];
        dfs(1,vis,t);
        if(start != 1){
            long curr =1;
            while(curr != start){
                curr = t.get((int)curr);
                k--;
            }
        }
        //System.out.println(start);
        Set<Long> set = new LinkedHashSet<>();
        set.add(start);
        long curr = t.get((int) start);
        while(true){
            if(set.contains(curr)) break;
            set.add(curr);
            curr = t.get((int) curr);
        }
        long idx = k % set.size();
        List<Long> l = new ArrayList<>();
        l.addAll(set);
        //System.out.println(set.toString() + " " +idx + " " + l.toString());
        System.out.println(l.get((int) idx));
    }
    public static boolean dfs(long curr, boolean[] vis, List<Long> t){
        if(vis[(int) curr]){
            start = curr;
            return true;
        }
        vis[(int) curr] = true;
        if(dfs(t.get((int) curr),vis,t)){
            return true;
        }
        return false;
    }
}
