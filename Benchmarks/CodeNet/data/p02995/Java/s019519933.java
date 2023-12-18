//package Atcoder131;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        long b = s.nextLong();
        long c = s.nextLong();
        long d = s.nextLong();
        long e = b-a;
        long d0 = -1;
        a = c;
        b = d;
        while(d0!=0){
            d0 = Math.max(a,b) % Math.min(a,b);
            a = Math.min(a,b);
            b = d0;
        }
        long g = a;
        long min = c*d / g;
        long f = e / min;
        System.out.println(e-(e/c+e/d)+f);
    }
}
