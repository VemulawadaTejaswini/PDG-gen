import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.List;

class Main{
    static double mod = 1e9+7;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();
        sc.close();
        int u1 = ty-sy;
        int r1 = tx-sx;
        int u2 = (ty+1)-sy;
        int r2 = (tx+1)-sx;
        for (int i=0;i<u1;i++){
            System.out.print("U");
        }
        for (int i=0;i<r1;i++){
            System.out.print("R");
        }
        for (int i=0;i<u1;i++){
            System.out.print("D");
        }
        for (int i=0;i<r1;i++){
            System.out.print("L");
        }
        System.out.print("L");
        for (int i=0;i<u2;i++){
            System.out.print("U");
        }
        for (int i=0;i<r2;i++){
            System.out.print("R");
        }
        System.out.print("DR");
        for (int i=0;i<u2;i++){
            System.out.print("D");
        }
        for (int i=0;i<r2;i++){
            System.out.print("L");
        }
        System.out.println("U");
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