//https://atcoder.jp/contests/abc109/tasks/abc109_c

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long X = sc.nextInt();
        ArrayList<Long> x = new ArrayList<>();
        ArrayList<Long> dif = new ArrayList<>();
        long gcd = 0;
        for (int i=0;i<N;i++){
            x.add(sc.nextLong());
        }
        x.add(X);
        sc.close();
        Collections.sort(x);
        for (int i=1;i<x.size();i++){
            dif.add(x.get(i)-x.get(i-1));
        }
        for (int i=0;i<dif.size();i++){
            gcd = GCD(gcd,dif.get(i));
        }
        System.out.println(gcd);
    }

    public static long GCD(long a,long b){
        if (a==0 || b==0){
            return Math.max(a,b);
        }
        if (a<b){
            long x = a;
            a = b;
            b = x;
        }
        if (a%b!=b){
            GCD(b,a%b);
        }
        return b;
    }
}