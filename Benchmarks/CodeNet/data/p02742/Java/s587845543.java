
import java.util.*;

public class Main {

    static final int MOD=1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long h=sc.nextInt();
        long w = sc.nextInt();
        long ans=0;
        ans = h*w/2;
        if(h%2==1&&w%2==1)ans++;
        System.out.println(ans);

    }
}
