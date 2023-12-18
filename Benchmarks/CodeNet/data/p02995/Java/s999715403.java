import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong(),d=sc.nextLong();
        long ans=0;
        ans+=b/c-(a-1)/c;
        ans+=b/d-(a-1)/d;
        ans-=b/(c*d/Euclid(c,d))-(a-1)/(c*d/Euclid(c,d));
        System.out.println(b-a+1-ans);

    }
    private static long Euclid(long n, long m) {
        long tmp;
        while (true) {
            if (n == 0) {
                return m;
            } else if (m == 0) {
                return n;
            }
            tmp = n;
            n = m;
            m = tmp;
            n = n % m;

        }

    }

}
