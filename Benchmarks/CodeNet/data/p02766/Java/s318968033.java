import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());
        long t = 1L;
        long ans = 1L;
        while(t < n) {
            t *= k;

            if(t < n) ++ans;
        }
        System.out.println(ans);
    }
}