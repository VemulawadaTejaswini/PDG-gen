import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.List;

class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Library lib = new Library();
    String S = sc.next();
    HashMap<Character,Integer> map = new HashMap<>();
    for (int i=0;i<4;i++){
        if (map.containsKey(String.valueOf(S.charAt(i)))){
            map.put(S.charAt(i),map.get(S.charAt(i))+1);
        } else {
            map.put(S.charAt(i),1);
        }
    }
    int ans_cnt1 = 0;
    int ans_cnt2 = 0;
    for (Character C:map.keySet()){
        ans_cnt1++;
        if (map.get(C)==2){
            ans_cnt2++;
        }
    }
    if (ans_cnt1==2 && ans_cnt2==2){
        System.out.println("Yes");
    } else {
        System.out.println("No");
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