import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

class Main{
    static double mod = 1e9+7;
    static HashMap<String,Integer> map;
    static int[] a;
    static long ans;
    static String[] march = {"M","A","R","C","H"};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        int N = sc.nextInt();
        sc.nextLine();
        map = new HashMap<>();
        for (String s:march){
            map.put(s,0);
        }
        a = new int[5];
        for (int i=0;i<N;i++){
            String s = sc.nextLine();
            String x = String.valueOf(s.charAt(0));
            if (x.equals("M") || x.equals("A") || x.equals("R") || x.equals("C") || x.equals("H")){
                if (map.containsKey(x)){
                    map.put(x,map.get(x)+1);
                } else {
                    map.put(x,1);
                }
            }
        }
        ans = 0;
        dfs(0);
        System.out.println(ans);
    }

    public static void dfs(int pos){
        if (pos==5){
            task();
            return;
        } else {
            a[pos] = 0;
            dfs(pos+1);
            a[pos] = 1;
            dfs(pos+1);
        }
    }

    public static void task(){
        int cnt = 0;
        long res = 1;
        for (int i=0;i<5;i++){
            if (a[i]==1){
                cnt++;
                res *= map.get(march[i]);
            }
        }
        if (cnt!=3){
            return;
        } else {
            ans += res;
            return;
        }
    }
}

class Library{
    static long a;
    static long b;

    public static long gcd(long a,long b){
        Library lib = new Library();
        if (a<b){
            lib.swap(a,b);
        }
        if (b==0){
            return a;
        } else {
            return gcd(b,a%b);
        }
    }

    public static void swap(long a,long b){
        long x = a;
        a = b;
        b = x;
        return;
    }
}