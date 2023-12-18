import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = sc.nextLong();
        long prev = 0;
        long ans = 0;
        for(int i = 0 ; i < n; i++){
            long next = sc.nextLong();
            ans += Math.min(t,next-prev);
            prev = next;
        }
        System.out.println(ans+t);
    }
}
