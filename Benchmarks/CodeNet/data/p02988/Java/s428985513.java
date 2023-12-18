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
        //Library lib = new Library();
        int n = sc.nextInt();
        ArrayList<Integer> p = new ArrayList<>();
        for (int i=0;i<n;i++){
            p.add(sc.nextInt());
        }
        int ans = 0;
        for (int i=1;i<n-1;i++){
            if (p.get(i-1)<p.get(i) && p.get(i)<p.get(i+1)){
                ans++;
            } else if(p.get(i+1)<p.get(i) && p.get(i)<p.get(i-1)){
                ans++;
            }
        }
        System.out.println(ans);
    }
}

/*class Library{
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
}*/