import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        long ans = 0;
        if(x<y){
            ans = y-x;
        }else{
            x=x*-1;
            ans++;
            if(x<=y)ans += y-x;
            else{
                ans++;
                y=y*-1;
                ans += y-x;
            }
        }
        System.out.println(ans);
    }
}
