import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        long ans = 0;
        if(a >= b || k < a) ans = k + 1;
        else{
            long x = k + 1;
            ans = a;
            k -= a-1;
            while(k > 1){
                ans += b - a;
                k -= 2;
            }
            if(k == 1) ans++;
            ans = Math.max(ans, x);
        }
        System.out.println(ans);
    }
}
 