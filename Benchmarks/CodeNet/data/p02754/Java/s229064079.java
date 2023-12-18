import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long b = sc.nextLong();
        long r = sc.nextLong();
        long sum = b+r;

        long ans = 0;
        ans = (n/sum)*b;
        ans = ans+(Math.min(n%sum,b));

        
        System.out.println(ans);
    }
}
