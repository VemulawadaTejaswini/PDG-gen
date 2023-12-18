import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLing();
        long a = sc.nextLing();
        long b = sc.nextLing();
        long ans = n/(a+b)*a;
        ans += Math.min(a,n%(a+b));
        System.out.println(ans);
    }
}