//package com.company;


import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String pat = sc.next();
        String possible = "";
        for (int i = 0; i < first.length(); i++) {
            if (fitAtidx(first, pat, i)){
                String sss = change(first, pat, i);
                if (possible.equals("")) possible = sss;
                else if (lexSmall(sss, possible)){
                    possible = sss;
                }
            }
        }
        if (possible.equals("")){
            System.out.println("UNRESTORABLE");
        } else {
            System.out.println(possible);
        }

    }

    public static boolean fitAtidx(String a, String b, int idx){
        if (idx == 2){
            int we = 1;
        }
        if (a.length() - idx < b.length()) return false;
        for (int i = idx; i < idx + b.length(); i++) {
            if (a.charAt(i) == b.charAt(i - idx)) continue;
            if (a.charAt(i) == '?') continue;
            return false;
        }
        return true;
    }
    public static String change(String a, String b, int idx){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (i < idx || i >= idx + b.length()){
                if (a.charAt(i) == '?'){
                    sb.append('a');
                } else {
                    sb.append(a.charAt(i));
                }
            } else {
                sb.append(b.charAt(i - idx));
            }
        }
        return sb.toString();
    }
    public static boolean lexSmall(String a, String b){
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) < b.charAt(i)) return true;
            if (a.charAt(i) > b.charAt(i)) return false;
        }
        return false;
    }
    static class MyScanner {
        StringTokenizer st;
        BufferedReader br;

        public MyScanner(InputStream s){  br = new BufferedReader(new InputStreamReader(s));}

        public MyScanner(FileReader s) throws FileNotFoundException {br = new BufferedReader(s);}

        public String next() throws IOException
        {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {return Integer.parseInt(next());}

        public long nextLong() throws IOException {return Long.parseLong(next());}

        public String nextLine() throws IOException {return br.readLine();}

        public double nextDouble() throws IOException { return Double.parseDouble(next()); }

        public boolean ready() throws IOException {return br.ready();}
    }
}
