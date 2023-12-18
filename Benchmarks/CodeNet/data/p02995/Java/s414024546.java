import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long sc = scanner.nextLong();
        long sc2 = scanner.nextLong();
        long sc3 = scanner.nextLong();
        long sc4 = scanner.nextLong();
        long bet = sc - sc2;
        int cnt = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        long tmp = bet/sc3;
        long tmp2 = (bet - sc3)/sc3;
        long minus1 = tmp - tmp2;
        
        long tmp3 = bet/sc4;
        long tmp4 = (bet - sc4)/sc4;
        long minus2 = tmp - tmp2;
        
        long tmp5 = bet/lcm(sc3,sc4);
        long tmp6 = (bet - lcm(sc3,sc4))/lcm(sc3,sc4);
        long minus3 = tmp5 - tmp6;
        
        long ans = bet - minus1 - minus2 - minus3;
        System.out.println(-ans);
    }
    private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
    }
    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }
}