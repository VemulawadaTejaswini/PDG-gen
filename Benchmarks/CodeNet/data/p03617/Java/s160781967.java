import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long q = Long.parseLong(sc.next());
        long h = Long.parseLong(sc.next());
        long s = Long.parseLong(sc.next());
        long d = Long.parseLong(sc.next());
        long n = Long.parseLong(sc.next());
        long kijun = Math.min(Math.min(8*q, 4*h), Math.min(2*s, d));
        long ans = (n / 2) * kijun + Math.min(s, Math.min(4*q, 2*h)); 
        System.out.println(ans);
    }
 
}