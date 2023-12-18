import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        int ans;
        if(a>=b&&a>=c)ans = a*10+b+c;
        else if(b>=a&&b>=c)ans = b*10+a+c;
        else ans = c*10+a+b;
        System.out.println(ans);
    }
}
