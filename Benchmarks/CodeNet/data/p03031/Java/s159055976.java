//https://atcoder.jp/contests/abc128/tasks/abc128_c

import java.util.Scanner;
import java.util.ArrayList;

class Main{
    static int N,M;
    static ArrayList<ArrayList<Integer>> s = new ArrayList<>();
    static ArrayList<Integer> p = new ArrayList<>();
    static int[] a;
    static int ans = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        for (int i=0;i<M;i++){
            int k = sc.nextInt();
            ArrayList<Integer> si = new ArrayList<>();
            for (int j=0;j<k;j++){
                si.add(sc.nextInt());
            }
            s.add(si);
        }
        for (int i=0;i<M;i++){
            p.add(sc.nextInt());
        }
        sc.close();
        a = new int[N];
        dfs(0);
        System.out.println(ans);
    }
    
    public static void dfs(int pos){
        if (pos==N){
            func();
        } else {
            a[pos] = 0;
            dfs(pos+1);
            a[pos] = 1;
            dfs(pos+1);
        }
    }

    public static void func(){
        int count = 0;
        for (int i=0;i<s.size();i++){
            int cnt1 = 0;
            for (Integer si:s.get(i)){
                if (a[si-1]==1){
                    cnt1++;
                }
            }
            if (cnt1%2==p.get(i)){
                count++;
            }
        }
        if (count==M){
            ans++;
        }
    }
}