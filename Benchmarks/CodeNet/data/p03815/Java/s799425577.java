import java.util.*;

// public class A{
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = x - x % 11L;
        long ans = y / 11L * 2L;
        ans += (x % 11L <= 6)? 1L : 2L;
        System.out.println(ans);
    }
}